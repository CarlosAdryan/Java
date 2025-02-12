package entities;

import java.util.Date;

public class Order {
	
	private Date date;
	private Triangle product;
	public Order(Date date, Triangle product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Triangle getProduct() {
		return product;
	}
	public void setProduct(Triangle product) {
		this.product = product;
	}
	
	
}
