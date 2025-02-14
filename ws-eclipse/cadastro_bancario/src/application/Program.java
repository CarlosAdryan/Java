package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosBacarios;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountnumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char yesorno = sc.nextLine().charAt(0);
		double initialdeposit = 0;
		if (yesorno == 'y' || yesorno == 'Y') {
			System.out.print("Enter initial deposit value: ");
			initialdeposit = sc.nextDouble();
			System.out.println();
			System.out.println("Account data:");
			System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", accountnumber, holder, initialdeposit);
		} else if (yesorno == 'n' || yesorno == 'N') {
			System.out.println("Account data:");
			System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", accountnumber, holder, initialdeposit);
		}

		double saldo = initialdeposit;
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		DadosBacarios dadosbancarios = new DadosBacarios(saldo, deposit);
		System.out.println("Update account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n %n", accountnumber, holder, dadosbancarios.depositos());
		System.out.print("Enter a withdraw value: ");
		double saldoum = dadosbancarios.depositos();
		double saque= sc.nextDouble();
		double c = saldoum - saque - 5.00;
		System.out.println("Update account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n ", accountnumber, holder, c);

		sc.close();

	}

}
