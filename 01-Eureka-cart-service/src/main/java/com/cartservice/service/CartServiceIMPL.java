package com.cartservice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cartservice.dto.CartDto;
import com.cartservice.model.Cart;
import com.cartservice.proxy.ProductServiceProxy;
import com.cartservice.repository.CartRepositoy;

@Service
public class CartServiceIMPL implements CartService {
	@Autowired
	private CartRepositoy repo;

	@Autowired
	private ProductServiceProxy proxy;

	@Override
	public List<Cart> getData() {
		return repo.findAll();
	}

	@Override
	public Cart getDataById(int cartId) {
		return repo.findById(cartId).get();
	}

	@Override
	public CartDto getCartInfoWithProductInfo(int cartId) {
		
		Cart cart = repo.findById(cartId).get();
		
		Map<String, Integer> urivariables = new HashMap<String, Integer>();
		
		urivariables.put("productId", cart.getProductId());
		
		ResponseEntity<CartDto> reponse = new RestTemplate().getForEntity("http://localhost:8098/Product/{productId}", CartDto.class, urivariables);
		
		CartDto dto = reponse.getBody();
		
		
		return new CartDto(cart.getCartId(),cart.getProductId(),dto.getProductName(),dto.getProductPrice());
	}

	@Override
	public CartDto getCartInfoWithProductInfoProxy(int cartId) {
		
		Cart cart = repo.findById(cartId).get();
		
		CartDto dto = proxy.retrieveProductData(cart.getProductId());
		
		return new CartDto(cart.getCartId(), cart.getProductId(), dto.getProductName(), dto.getProductPrice());
	}

}
