package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Taxpaid;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpaid> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
					
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();	
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} 
			else{
				System.out.print("Number of employees: ");
				int employeeNumber = sc.nextInt();
				list.add(new Company(name, anualIncome, employeeNumber));
			}
		}
		
		double totalList = 0;
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Taxpaid t: list) {
			totalList += t.taxpaid();
			System.out.println(t);
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalList));
		
		sc.close();
	}
}
