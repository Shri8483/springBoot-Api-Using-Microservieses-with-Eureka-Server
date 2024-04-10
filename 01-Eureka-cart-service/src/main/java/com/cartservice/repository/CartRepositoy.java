package com.cartservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartservice.model.Cart;

@Repository
public interface CartRepositoy extends JpaRepository<Cart, Integer> {

}
