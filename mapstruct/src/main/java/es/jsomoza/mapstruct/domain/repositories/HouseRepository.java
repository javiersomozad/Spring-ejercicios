package es.jsomoza.mapstruct.domain.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.jsomoza.mapstruct.domain.House;

public interface HouseRepository extends CrudRepository<House, Long> {
	List<House> findByName(String name);
}
