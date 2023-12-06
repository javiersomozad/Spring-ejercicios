package es.jsomoza.excepciones.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.jsomoza.excepciones.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByName(String name);

}