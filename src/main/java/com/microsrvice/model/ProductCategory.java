package com.microsrvice.model;




import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int id;
	
	
	private String name;
	
	
    



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "ProductCategory [id=" + id + ", name=" + name + "]";
	}



	public ProductCategory(int id, String name, Product product) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	public ProductCategory() {
		super();
	}
	



	


	

	


	


	
	
	

}
