package entities;

public abstract class Taxpaid {
	
	private String name;
	public double anualIncome;
	
	public Taxpaid() {
	}
	
	public Taxpaid(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double taxpaid();

	@Override
	public String toString() {
		return getName() 
				+ ": $ "
				+ String.format("%.2f", taxpaid());
	}
}
