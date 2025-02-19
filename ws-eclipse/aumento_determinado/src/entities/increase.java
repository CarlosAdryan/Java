package entities;

public class increase {
	private int id;
	private String name;
	private double wage;
	
	public increase() {
		
	}
	
	public increase(int id, String name, double wage) {
		this.id = id;
		this.name = name;
		this.wage = wage;
	}
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
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public void increaseSalary(double percentage) {
		this.wage += this.wage * percentage / 100;
	}
	
	@Override
	public String toString() {
		return + id + ", " + name + String.format(", %.2f", wage);
	}
	
	

}
