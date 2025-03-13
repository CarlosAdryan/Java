package entities;

public class Individual extends Taxpaid {
	
	private double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxpaid() {
		double tax = 0;
		
		 if (anualIncome < 20000.00 ) {
			tax = (anualIncome * 0.5) - (healthExpenditures * 0.5);
		} else {
			tax = (anualIncome * 0.25) - (healthExpenditures * 0.5);
		}
		 return tax;
	}	
}
