package com.book.model;

public class Cart {

	private int Quantity;
	private Product product;
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Cart(int quantity, Product product) {
		super();
		Quantity = quantity;
		this.product = product;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

}
