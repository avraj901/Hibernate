package com.nt.entity;

import java.io.Serializable;

public class Product implements Serializable{
	
	private int productId;
	private String productName;
	private float productPrice;
	private int productQuentity;
	
	
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


	public float getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}


	public int getProductQuentity() {
		return productQuentity;
	}


	public void setProductQuentity(int productQuentity) {
		this.productQuentity = productQuentity;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuentity=" + productQuentity + "]";
	}
	

}
