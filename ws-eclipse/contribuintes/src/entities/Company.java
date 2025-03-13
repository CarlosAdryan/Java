package entities;

public class Company extends Taxpaid{
	
	private int employeeNumber;
	
	public Company() {
		super();
	}

	public Company(String name, double anualIncome, int employeeNumber) {
		super(name, anualIncome);
		this.employeeNumber = employeeNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double taxpaid() {
		double tax = 0;
		
		 if (employeeNumber > 10 ) {
			tax += anualIncome * 0.14;
		} else {
			tax += anualIncome * 0.1 ;
		}
		 return tax; 		
	}
}
