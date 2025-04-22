package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		String palavra = Integer.toString(n);
		
		for (int i=0; i != palavra.charAt(i); i++) {
			
		}
		
		sc.close();
	}
}
