package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int prime = 0; 
		if (n >= 2) {
			for (int i=2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					prime = 1; // achou um divisor => NÃO é primo
					break; // achou um divisor, não precisa continuar
				} 
			}
			if (prime != 1) { // ou seja, se NÃO achou nenhum divisor
				System.out.println("Prime");
			}else {
				System.out.println("Not prime");
			}
		} else {
			System.out.println("Not prime");
		}
		sc.close();	
	}
}
