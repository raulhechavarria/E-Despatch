package com.despatch.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despatch.entity.Product;
import com.despatch.repository.ProductRepository;
import com.despatch.rest.request.ProductRequest;
import com.despatch.service.ProductService;
import com.despatch.service.dto.ProductDto;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<ProductDto> getProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		List<ProductDto> dtos = new ArrayList<>();
		products.forEach(p -> {
			ProductDto dto = new ProductDto(p.getId(), p.getName(), p.getUm());
			dtos.add(dto);
		});
		return dtos;
	}

	@Override
	public ProductDto saveProduct(ProductRequest productRequest) {
		Product product = new Product();
		product.setName(productRequest.getName());
		product.setUm(productRequest.getUm());
		product = productRepository.save(product);
		ProductDto dto = new ProductDto(product.getId(), product.getName(), product.getUm());
		return dto;
	}

	@Override
	public Boolean deleteProduct(Long id) {
		try {
			productRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
