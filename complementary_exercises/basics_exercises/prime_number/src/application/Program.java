package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int prime = 0; 
		if (n >= 1) {
			for (int i=2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					prime = 1;
				} 
			}
			if (prime == 0) {
				System.out.println("Not prime");
			} else {
				System.out.println("Prime");
			}
		}
		sc.close();	
	}
}
