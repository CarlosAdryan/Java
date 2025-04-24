package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two whole numbers: ");
		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = n + x;
		
		System.out.print("The sum of " + n + " and " + x + " is: " + sum);
		
		sc.close();
	}
}
