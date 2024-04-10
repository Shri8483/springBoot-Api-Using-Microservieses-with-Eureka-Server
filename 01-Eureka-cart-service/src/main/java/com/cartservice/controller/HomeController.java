package com.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartservice.dto.CartDto;
import com.cartservice.model.Cart;
import com.cartservice.service.CartService;

@RestController
@RequestMapping("/cart")
public class HomeController {
	@Autowired
	private CartService service;
	
	@GetMapping("/")
	public List<Cart> getData(){
		return service.getData();
		
	}
	
	@GetMapping("/{cartId}")
	public Cart getDataById(@PathVariable int cartId) {
		return service.getDataById(cartId);
		
	}
	
	@GetMapping("/dto/{cartId}")
	public CartDto getCartInfoWithProductInfo(@PathVariable int cartId) {
		
		return service.getCartInfoWithProductInfo(cartId);
	}
	
	@GetMapping("/proxy-dto/{cartId}")
	public CartDto getCartInfoWithProductInfoProxy(@PathVariable int cartId) {
		return service.getCartInfoWithProductInfoProxy(cartId);
	}


}
