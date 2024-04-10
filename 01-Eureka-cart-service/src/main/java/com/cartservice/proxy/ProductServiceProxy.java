package com.cartservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cartservice.dto.CartDto;

@FeignClient(name="product-service")
     public interface ProductServiceProxy {

	@GetMapping("/Product/{productId}")
	public CartDto retrieveProductData(@PathVariable Integer productId);

     }



