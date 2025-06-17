package in.techmafif.backend.controllers;

import in.techmafif.backend.dto.ProductDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@GetMapping
	public List<ProductDto> getAllProducts() {
		return null;
	}
	
	
	//Create Product
	@PostMapping
	public ProductDto createProduct(@RequestBody ProductDto productDto) {
		return null;
	}
}
