package com.cartservice.dto;

public class CartDto {
	
	private int cartId;
	private int productId;
	private String productName;
	private int productPrice;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "CartDto [cartId=" + cartId + ", productId=" + productId + ", productName=" + productName
				+ ", productPrice=" + productPrice + "]";
	}
	public CartDto(int cartId, int productId, String productName, int productPrice) {
		super();
		this.cartId = cartId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public CartDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
