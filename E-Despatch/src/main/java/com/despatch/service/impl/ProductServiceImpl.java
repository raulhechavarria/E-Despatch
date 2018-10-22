package com.despatch.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despatch.entity.Product;
import com.despatch.entity.enumerator.UMEnum;
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
			ProductDto dto = new ProductDto(p.getId(), p.getName(), p.getDescription(), p.getPrice(), p.getWeight(),
					p.getUm());
			dtos.add(dto);
		});
		return dtos;
	}

	@Override
	public ProductDto saveProduct(ProductRequest productRequest) {
		Product product = new Product();
		product.setName(productRequest.getName());
		product.setUm(checkedenum(productRequest.getUm()));
		product.setDescription(productRequest.getDescription());
		product.setPrice(productRequest.getPrice());
		product.setWeight(productRequest.getWeight());
		product = productRepository.save(product);
		ProductDto dto = new ProductDto(product.getId(), product.getName(), product.getDescription(),
				product.getPrice(), product.getWeight(), product.getUm());
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

	@Override
	public List<ProductDto> findByName(String name) {
		List<Product> products = new ArrayList<>();
		List<Object> test = new ArrayList<>();
		List<ProductDto> dtos = new ArrayList<>();
		productRepository.findByName(name).forEach(products::add);
		products.forEach(test::add);// testing add
		products.forEach(p -> {
			dtos.add(
					new ProductDto(p.getId(), p.getName(), p.getDescription(), p.getPrice(), p.getWeight(), p.getUm()));
		});
		return dtos;
	}

	@Override
	public ProductDto findById(Long id) {
		Product product = productRepository.findById(id).get();
		ProductDto dto = new ProductDto(product.getId(), product.getName(), product.getDescription(),
				product.getPrice(), product.getWeight(), product.getUm());
		return dto;
	}

	@Override
	public ProductDto updateProduct(ProductRequest productRequest) {
		Product product = new Product();
		product.setId(productRequest.getId());
		product.setName(productRequest.getName());
		product.setUm(checkedenum(productRequest.getUm()));
		product.setDescription(productRequest.getDescription());
		product.setPrice(productRequest.getPrice());
		product.setWeight(productRequest.getWeight());
		product = productRepository.save(product);
		ProductDto dto = new ProductDto(product.getId(), product.getName(), product.getDescription(),
				product.getPrice(), product.getWeight(), product.getUm());
		return dto;
	}

	public UMEnum checkedenum(String str) {
		if (str == null) {
			return null;
		}
		if (str.length() <= 0) {
			return null;
		}

		return UMEnum.valueOf(str);

	}

}
