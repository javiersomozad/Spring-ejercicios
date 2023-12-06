package es.jsomoza.onetoone;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BarRepository extends CrudRepository<Bar, Long> {
	List<Bar> findByName(String name);
	List<Bar> findByAddress(String address);
	Bar findByLicense(License license);
}
