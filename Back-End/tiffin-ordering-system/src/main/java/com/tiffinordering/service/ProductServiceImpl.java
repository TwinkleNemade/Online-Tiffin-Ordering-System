package com.tiffinordering.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.tiffinordering.dao.ProductDao;
import com.tiffinordering.model.Product;
import com.tiffinordering.utility.StorageService;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired 
	private ProductDao productDao;
	
	@Autowired
	private StorageService storageService;

	@Override
	public void addProduct(Product product, MultipartFile productImmage) {
		
		String productImageName = storageService.store(productImmage);
		
		product.setImageName(productImageName);
		
		this.productDao.save(product);
	}

}
