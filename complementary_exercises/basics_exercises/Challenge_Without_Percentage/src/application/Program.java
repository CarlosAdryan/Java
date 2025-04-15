package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int rest = n - (n / 2) * 2;
		
		if (rest == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		sc.close();
	}
}
