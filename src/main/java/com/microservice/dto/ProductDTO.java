package com.microservice.dto;





public class ProductDTO {
	
	private int id;
	private String productName;
	private int productCategoryId;
	private double price;
	private String description;
	private String imageName;
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
	public int getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategory(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", productName=" + productName + ", productCategory=" + productCategoryId
				+ ", price=" + price + ", description=" + description + ", imageName=" + imageName + ", quantity="
				+ quantity + "]";
	}
	public ProductDTO(int id, String productName, int productCategoryId, double price, String description,
			String imageName, String quantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.price = price;
		this.description = description;
		this.imageName = imageName;
		this.quantity = quantity;
	}
	
	
	
	
	
	


}
