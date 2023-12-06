package es.jsomoza.excepciones.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import es.jsomoza.excepciones.command.ProductCommand;
import es.jsomoza.excepciones.domain.Product;
import lombok.Synchronized;

@Component
public class ProductToProductCommand implements Converter<Product, ProductCommand> {

  @Synchronized
  @Nullable
  @Override
  public ProductCommand convert(Product product) {
    if (product == null) {
      return null;
    }

    final ProductCommand productCommand = new ProductCommand();

    productCommand.setId(product.getId());
    productCommand.setName(product.getName());
    productCommand.setPrice(product.getPrice());

    return productCommand;
  }
}