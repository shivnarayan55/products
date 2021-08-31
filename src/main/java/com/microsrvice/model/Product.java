package com.microsrvice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="product_name")
	private String productName;
	
	
	
//	@ManyToOne(fetch = FetchType.EAGER ,cascade=CascadeType.PERSIST)
//	@JoinColumn(name="category_id", referencedColumnName= "category_id")
//	private ProductCategory productCategory;
	
	@Column
	private int categoryId;
	
	
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	private double price;
	private String description;
	private String imageName;
	
//	@JsonIgnore
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
//    private List<Cart> carts;
	
	
	
	

	

//	public ProductCategory getProductCategory() {
//		return productCategory;
//	}
//
//	public void setProductCategory(ProductCategory productCategory) {
//		this.productCategory = productCategory;
//	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Column(name ="quantity")
	private String quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	

	

	

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", categoryId=" + categoryId + ", price=" + price
				+ ", description=" + description + ", imageName=" + imageName + ", quantity=" + quantity + "]";
	}

	public Product(int id, String productName, int categoryId, double price, String description, String imageName,
			String quantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.categoryId = categoryId;
		this.price = price;
		this.description = description;
		this.imageName = imageName;
		this.quantity = quantity;
	}

	

	

	

	
	
	

	
	
	
	
	
	
	

}
