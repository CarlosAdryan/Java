package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.increase;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ArrayList<Integer> ListaDeIds = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String name = null;
		double wage = 0.0;
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		System.out.println();
		
		increase vect[] = new increase[10];
		
		for(int i=0; i<n; i++) {
		System.out.printf("Emplyoee #%d : %n", i+1);
		System.out.print("Id: ");
		id = sc.nextInt();
		ListaDeIds.add(id);
		System.out.print("Name: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Salary: ");
		wage = sc.nextDouble();	
		System.out.println();
		
		increase employee = new increase(id, name, wage);
		
		vect[i] = employee;
		
		}
		
		System.out.print("Enter the employee id that will have the salary increase : ");
		int idincrease = sc.nextInt();
		int index = ListaDeIds.indexOf(idincrease);
		
		if(index != -1) {
				increase employee = vect[index];
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				employee.increaseSalary(percentage);
				
				System.out.println();
				
				System.out.println("List of employees:");
				for(int i=0; i<=n; i++) {
					if(vect[i] != null) {
						System.out.println(vect[i]);
					}
				}
		} else {
			System.out.println("This id does not exist!");
			
			System.out.println();
			System.out.println("List of employees:");
			for(int i=0; i<=n; i++) {
				if(vect[i] != null) {
					System.out.println(vect[i]);
				}
				
			}
		}
		
		
		
		

		sc.close();
	}

	}
