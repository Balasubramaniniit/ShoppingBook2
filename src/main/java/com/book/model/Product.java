package com.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

// entity is to create table in database under name ProductDetails
@Entity(name="ProDetails")
// @component is to make a one component of class in below.
@Component
public class Product {
	// @Id is to make primary key to firstname

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	@NotNull(message="Name is required")
	private String productname;
	@NotNull(message="Quantity is required")
	private int productquantity;
	@NotNull(message="Description is required")
	private String productdescription;
	private String category;
	@NotNull(message="Price is required")
	private int productprice;
	
	private String imagename;
	@Transient
	private  MultipartFile image;

	

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public MultipartFile getImage() {
		return image;
		
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getproductid() {
		return productid;
	}

	public void setproductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

}
