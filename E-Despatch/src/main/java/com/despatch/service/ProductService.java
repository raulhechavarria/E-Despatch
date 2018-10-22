package com.despatch.service;

import java.util.List;

import com.despatch.rest.request.ProductRequest;
import com.despatch.service.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getProducts();

	ProductDto saveProduct(ProductRequest productRequest);

	Boolean deleteProduct(Long id);

	List<ProductDto> findByName(String name);

	ProductDto findById(Long id);

	ProductDto updateProduct(ProductRequest productRequest);

}
