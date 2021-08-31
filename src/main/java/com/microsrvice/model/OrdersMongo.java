package com.microsrvice.model;

import javax.persistence.Column;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Order")
public class OrdersMongo {

@Id	
private int id;
	
	
	private int userId;
	
	
	

	private double totalPrice;
    private String address;
	
	
	private String orderStatus;
	
	
	private String username;
	
	
	

	public OrdersMongo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrdersMongo(int id, int userId, double totalPrice, String address, String orderStatus, String username) {
		super();
		this.id = id;
		this.userId = userId;
		this.totalPrice = totalPrice;
		this.address = address;
		this.orderStatus = orderStatus;
		this.username = username;
	}


	@Override
	public String toString() {
		return "OrdersMongo [id=" + id + ", userId=" + userId + ", totalPrice=" + totalPrice + ", address=" + address
				+ ", orderStatus=" + orderStatus + ", username=" + username + "]";
	}


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
