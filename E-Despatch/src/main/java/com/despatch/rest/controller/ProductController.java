package com.despatch.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.despatch.rest.request.ProductRequest;
import com.despatch.service.ProductService;
import com.despatch.service.dto.ProductDto;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping(value = "/product")
	public @ResponseBody List<ProductDto> getProducts() {
		return productService.getProducts();
	}
	
	@PostMapping(value = "/product")
	public @ResponseBody ProductDto saveProduct(@RequestBody ProductRequest productRequest) {
		return productService.saveProduct(productRequest);
	}
	
	@DeleteMapping(value = "/product/{id}")
	public @ResponseBody Boolean DeleteProduct(@PathVariable Long id) {
		return productService.deleteProduct(id);
	}
}
