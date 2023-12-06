package es.jsomoza.i18nvalidation.converters;

import es.jsomoza.i18nvalidation.commands.OrderCommand;
import es.jsomoza.i18nvalidation.domain.Order;
import lombok.Synchronized;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class OrderToOrderCommand implements Converter<Order, OrderCommand> {

  @Synchronized
  @Nullable
  @Override
  public OrderCommand convert(Order order) {
    if (order == null) {
      return null;
    }

    final OrderCommand orderCommand = new OrderCommand();

    orderCommand.setId(order.getId());
    orderCommand.setDescription(order.getDescription());
    orderCommand.setDate(order.getDate());
    orderCommand.setTotal(order.getTotal());
    
    return orderCommand;
  }
}