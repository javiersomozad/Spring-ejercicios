package es.jsomoza.i18nvalidation.service;

import java.util.List;
import java.util.Optional;

import es.jsomoza.i18nvalidation.commands.OrderCommand;
import es.jsomoza.i18nvalidation.domain.Order;

public interface OrderService {
	public Optional<Order> getById(Long id);
	public List<Order> getOrders();
	public OrderCommand saveOrder(OrderCommand orderCommand);
}
