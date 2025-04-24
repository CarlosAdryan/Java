package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int fatorial = 1;
		for (int i = n; i >= 1; i--) {
			fatorial *= i ;
		}
		System.out.println(fatorial);	
		
		sc.close();
	}
}
