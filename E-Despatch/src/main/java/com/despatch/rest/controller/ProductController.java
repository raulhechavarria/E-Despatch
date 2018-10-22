package com.despatch.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.despatch.rest.request.ProductRequest;
import com.despatch.service.ProductService;
import com.despatch.service.dto.ProductDto;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping
	public @ResponseBody List<ProductDto> getProducts() {
		return productService.getProducts();

	}
	
	@GetMapping(value = "name/{obj}")
	public @ResponseBody List<ProductDto> getProductByName(@PathVariable String obj) {
			return productService.findByName(obj);
	}

	@GetMapping(value = "/{id}")
	public @ResponseBody ProductDto getProductByName(@PathVariable Long id) {
		return productService.findById(id);
	}
	

	@PostMapping
	public @ResponseBody ProductDto saveProduct(@RequestBody ProductRequest productRequest) {
		return productService.saveProduct(productRequest);
	}
	
	@PutMapping
	public @ResponseBody ProductDto updateProduct(@RequestBody ProductRequest productRequest) {
		return productService.updateProduct(productRequest);
	}
	

	@DeleteMapping(value = "/{id}")
	public @ResponseBody Boolean deleteProduct(@PathVariable Long id) {
		return productService.deleteProduct(id);
	}

	 public static boolean isNumeric(String obj) {
	        boolean resultado;
	        try {
	            Integer.parseInt(obj);
	            resultado = true;
	        } catch (NumberFormatException excepcion) {
	            resultado = false;
	        }
	        return resultado;
	    }

}
