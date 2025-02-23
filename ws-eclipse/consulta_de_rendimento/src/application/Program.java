package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		sc.nextLine();
		String namedepartment = sc.nextLine();
		System.out.println("Enter worker data: ");
		String nameemployee = sc.nextLine();
		// LEVEL
		Double salary = sc.nextDouble();
		System.out.print("How many contracts to this worker? ");
		int contracts = sc.nextInt();
		for(int i=0; i<contracts; i++) {
			System.out.printf("Enter contract %d# data: ", i + 1);
			System.out.print("Date (DD/MM/YYYY): ");
		}
		
		sc.close();

	}

}
