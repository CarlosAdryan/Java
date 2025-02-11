package entities;

public class Employee {
		public String name;
		public Double GrossSalary;
		public Double Tax;
		public Double percentage;
		
		public double NetSalary() {
			return GrossSalary - Tax;
		}
		
		public double increaseSalary() {
			return (percentage / 100) * GrossSalary + GrossSalary - Tax;
		}

}
