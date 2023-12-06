package es.jsomoza.i18nvalidation.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.jsomoza.i18nvalidation.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByDescription(String description);
}
