package es.jsomoza.rest.repository;

import es.jsomoza.rest.entities.Maker;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MakerRepository extends CrudRepository<Maker, Long> {
	List<Maker> findMakerByName(String name);
}
