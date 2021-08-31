package com.microsrvice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private int userId;
	
	
	
	@Column
	private double totalPrice;
	
	
	
	@Column
	private String address;
	
	@Column
	private String orderStatus;
	
	@Column
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	

	

	
	

	

	
	public Orders(int id, int userId, double totalPrice,  String address, String orderStatus,
			String username) {
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
		return "Orders [id=" + id + ", userId=" + userId + ", totalPrice=" + totalPrice 
				+ ", address=" + address + ", orderStatus=" + orderStatus + ", username=" + username + "]";
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
