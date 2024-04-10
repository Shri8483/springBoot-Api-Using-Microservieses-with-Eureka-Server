package com.cartservice.service;

import java.util.List;

import com.cartservice.dto.CartDto;
import com.cartservice.model.Cart;

public interface CartService {

	List<Cart> getData();

	Cart getDataById(int cartId);

	CartDto getCartInfoWithProductInfo(int cartId);

	CartDto getCartInfoWithProductInfoProxy(int cartId);

}
