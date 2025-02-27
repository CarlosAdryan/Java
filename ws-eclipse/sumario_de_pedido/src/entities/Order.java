package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	Orderitem orderitem = new Orderitem();

	List<Product> products = new ArrayList<>();
	
	public Order() {
		
	}
	
	private Date moment;
	private OrderStatus status;

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	public Order(OrderStatus status) {
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(Product product) {
		products.add(product);
	}
	
	public void removeItem(Product product) {
		products.remove(product);
	}
	
	public List<Product> getProduct() {
		return products;
	}

	
	
}
