package com.ustglobal.stock.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ustglobal.stock.dto.Product;
@Component
public class ProductResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private List<Product> product;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

}
