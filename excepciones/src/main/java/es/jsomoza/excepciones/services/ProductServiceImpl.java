package es.jsomoza.excepciones.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.jsomoza.excepciones.command.ProductCommand;
import es.jsomoza.excepciones.converters.ProductCommandToProduct;
import es.jsomoza.excepciones.converters.ProductToProductCommand;
import es.jsomoza.excepciones.domain.Product;
import es.jsomoza.excepciones.exceptions.ProductNotFoundException;
import es.jsomoza.excepciones.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

  private ProductRepository productRepository;
  private ProductToProductCommand productToProductCommand;
  private ProductCommandToProduct productCommandToProduct;
  
  
  
  public ProductServiceImpl(ProductRepository productRepository, 
      ProductToProductCommand productToProductCommand,
      ProductCommandToProduct productCommandToProduct) {
    this.productRepository = productRepository;
    this.productToProductCommand = productToProductCommand;
    this.productCommandToProduct = productCommandToProduct;
  }

  @Override
  public Product getById(Long id) {
    Optional<Product> product = productRepository.findById(id);
    
     if (!product.isPresent()) {
        throw new ProductNotFoundException("Producto no encontrado: " + id );
     }
     
    return product.get();
  }
  
  @Override
  public List<Product> getProducts() {
    return (List<Product>)productRepository.findAll();
  }

  @Override
  public ProductCommand saveProduct(ProductCommand productCommand){
    Product product = productCommandToProduct.convert(productCommand);
    Product savedProduct = productRepository.save(product);
    
    return productToProductCommand.convert(savedProduct);
  }

}