package com.tiffinordering.service;

import org.springframework.web.multipart.MultipartFile;

import com.tiffinordering.model.Product;

public interface ProductService {
	
	void addProduct(Product product, MultipartFile productImmage);

}
