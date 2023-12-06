package es.jsomoza.mapstruct.domain.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.jsomoza.mapstruct.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
	List<Owner> findByName(String name);
}
