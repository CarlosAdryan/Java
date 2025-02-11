package Emplo;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emplo = new Employee(); 
		
		System.out.print("Name: ");
		emplo.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emplo.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emplo.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", emplo.name, emplo.NetSalary());
	
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		emplo.percentage = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f", emplo.name, emplo.increaseSalary());
		sc.close();
	}

}
