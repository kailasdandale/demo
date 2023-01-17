package com.neo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.neo.model.Product;
import com.neo.model.UserInfo;
import com.neo.repository.ProductRepository;
import com.neo.repository.UserRepo;

@Service
public class UserInfoService {

	@Autowired
	private UserRepo repo;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public UserInfo createNewUser(UserInfo userInfo) {
		
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		
		return repo.save(userInfo);
	}

	public Product addNewProduct(Product product) {
		
		return productRepository.save(product);
	}

	public List<Product>  getAllProduct() {
	
		return productRepository.findAll();
	}

	public List<Product> getProductByName(String productName) {
		
		return productRepository.findByProductName(productName);
	}

	public List<Product> getProductByCategory(String category) {
		
		return productRepository.findByCategory(category);
	}

	
	
	
	
}
