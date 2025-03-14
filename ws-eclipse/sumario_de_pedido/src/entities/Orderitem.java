package entities;

public class Orderitem {
	
	private Integer quantity;
	private Double price;
	
	public Orderitem() {
		
	}
	
	public Orderitem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double subTotal(Integer quantity, Double price) {
		return price * quantity;
	}

}
