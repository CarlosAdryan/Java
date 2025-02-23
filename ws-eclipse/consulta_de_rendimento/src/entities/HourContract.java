package entities;

public class HourContract {
	
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}
	
	public HourContract(Double valuePerHour, Integer hours) {
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue(Double valuePerHour, Integer hours) {
		return hours * valuePerHour;
	}
	
	

}
