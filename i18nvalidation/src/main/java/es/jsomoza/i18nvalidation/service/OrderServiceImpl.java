package es.jsomoza.i18nvalidation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.jsomoza.i18nvalidation.commands.OrderCommand;
import es.jsomoza.i18nvalidation.converters.OrderCommandToOrder;
import es.jsomoza.i18nvalidation.converters.OrderToOrderCommand;
import es.jsomoza.i18nvalidation.domain.Order;
import es.jsomoza.i18nvalidation.repositories.OrderRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

  private OrderRepository orderRepository;
  private OrderToOrderCommand orderToOrderCommand;
  private OrderCommandToOrder orderCommandToOrder;
  
  public OrderServiceImpl(OrderRepository orderRepository, 
      OrderToOrderCommand orderToOrderCommand,
      OrderCommandToOrder orderCommandToOrder) {
    this.orderRepository = orderRepository;
    this.orderToOrderCommand = orderToOrderCommand;
    this.orderCommandToOrder = orderCommandToOrder;
  }

  @Override
  public Optional<Order> getById(Long id) {
    return orderRepository.findById(id);
  }
  
  @Override
  public List<Order> getOrders() {
    return (List<Order>)orderRepository.findAll();
  }

  @Override
  public OrderCommand saveOrder (OrderCommand orderCommand) {
    Order order = orderCommandToOrder.convert(orderCommand);
    Order savedMessage = orderRepository.save(order);
    
    return orderToOrderCommand.convert(savedMessage);
  }

}