package com.testapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

	private String productId;
    private String name;
    private String price;
    
    
	public Product() {
		super();
	}
	
	
	public Product(long id, String productId, String name, String price) {
		super();
		this.id = id;
		this.productId = productId;
		this.name = name;
		this.price = price;
	}



	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", productId=" + productId + ", name=" + name + ", price=" + price + "]";
	}

	
	
}
