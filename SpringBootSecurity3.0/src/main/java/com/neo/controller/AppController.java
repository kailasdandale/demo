package com.neo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.model.Product;
import com.neo.model.UserInfo;
import com.neo.service.UserInfoService;

@RestController
@RequestMapping("/api")
public class AppController {

	@Autowired
	private UserInfoService infoService;

	@GetMapping("/welcome")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String greeting() {
		
		return "hello";
	}

	
	
	@GetMapping("/adm")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String adminAccessDemo() {
		return "hey you are Authorised !!";
	}

	@GetMapping("/all")
	public String getAll() {
		return "welcome to our world";
	}
	
	
	
	//create new user or admin//
	@PostMapping("/create")
	public UserInfo createNewUser(@RequestBody UserInfo userInfo) {
		return infoService.createNewUser(userInfo);
	}
	
	//add new product//
	@PostMapping("/product")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public Product addNewProduct(@RequestBody Product product) {
		System.out.println(product);
		return infoService.addNewProduct(product);
	}
	
	@GetMapping("/allproduct")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Product> getAllProduct() {
		
		return infoService.getAllProduct();
	}
	
	@GetMapping("/{productName}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public List<Product> getProductByName(@PathVariable("productName") String productName) {
		
		return infoService.getProductByName(productName);
	}
	@GetMapping("/find/{category}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public List<Product> getProductByCategory(@PathVariable("category") String category) {
		
		return infoService.getProductByCategory(category);
	}
	
	
}
