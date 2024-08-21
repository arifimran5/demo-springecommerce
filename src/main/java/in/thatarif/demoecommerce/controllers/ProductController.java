package in.thatarif.demoecommerce.controllers;

import org.springframework.web.bind.annotation.RestController;

import in.thatarif.demoecommerce.entities.CreateProductDTO;
import in.thatarif.demoecommerce.services.ProductService;
import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/products")
	public ResponseEntity<String> postMethodName(@Valid @RequestBody CreateProductDTO newProduct) {
		String res = this.productService.Create(newProduct);
		return ResponseEntity.ok(res);
	}

}
