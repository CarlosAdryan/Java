package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to display its multiplication table: ");
		int n = sc.nextInt();
		
		System.out.println(); // Espaço antes de imprimir a tabuada.
		
		for (int i = 1; i <= 10; i++) {
			int mult = n * i; 
			System.out.println(n + " x " + i + " = " + mult);
		}
		sc.close();
	}
}
