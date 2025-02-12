package application;

import java.util.Scanner;

import entities.DadosBacarios;

public class Program {

	public static void main(String[] args) {
		
		DadosBacarios dados = new DadosBacarios();		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountnumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		char yesorno = sc.next().charAt(0);
		if (yesorno == 'y' || yesorno == 'Y') {
			System.out.println("Enter initial deposit value: ");
			
			double initialdeposit = sc.nextDouble();
			System.out.println("Account data:");
			System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", accountnumber, holder, initialdeposit);
		} else if (yesorno == 'n' || yesorno == 'N') {
			System.out.println("Account data:");
			double initialdeposit = 0;
			System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", accountnumber, holder, initialdeposit);
		}
		
		
		
		
		sc.close();

	}

}
