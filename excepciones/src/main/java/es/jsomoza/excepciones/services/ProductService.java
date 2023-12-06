package es.jsomoza.excepciones.services;

import java.util.List;

import es.jsomoza.excepciones.command.ProductCommand;
import es.jsomoza.excepciones.domain.Product;

public interface ProductService {
	public Product getById(Long id);
	public List<Product> getProducts();
	public ProductCommand saveProduct(ProductCommand productCommand);
}
