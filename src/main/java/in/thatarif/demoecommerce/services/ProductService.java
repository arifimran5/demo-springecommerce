package in.thatarif.demoecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import in.thatarif.demoecommerce.entities.CreateProductDTO;
import in.thatarif.demoecommerce.entities.Product;
import in.thatarif.demoecommerce.repositories.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> GetAll() {
		return this.productRepository.findAll();
	}

	public String Create(CreateProductDTO newProduct) {
		var product = new Product();
		product.setName(newProduct.getName());
		product.setDescription(newProduct.getDescription());
		product.setPrice(newProduct.getPrice());
		product.setQuantity(newProduct.getQuantity());
		Product savedProduct = this.productRepository.save(product);
		return "Product Created with: " + savedProduct.getId();
	}
}
