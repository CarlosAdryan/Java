package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		String palavra = Integer.toString(n);
		
		boolean ehPalindromo = true;
		
		for (int i=0; i < palavra.length() / 2; i++) {
			if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
				ehPalindromo = false;
				break; // não precisa continuar se já sabe que não é
			}
		}
		
		if (ehPalindromo) {
			System.out.println("Is palindrome!");
		} else {
			System.out.println("not palindrome.");
		}
		
		sc.close();
	}
}
