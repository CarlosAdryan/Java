package cadastro_bancario;

import java.util.Scanner;
import entities.Account;


public class Main {
	
	

	public static void main(String[] args) {
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number");
		int number = sc.nextInt();
		System.out.println("Enter account holder");
		String nome = sc.next();
		System.out.println("Is there na initial deposit (y/n)?");
		char realizarDeposito = sc.next().charAt(0);
		if (realizarDeposito == 'y' || realizarDeposito == 'Y') {
			System.out.println("Digite o valor do depósito");
			double valorDeposito = sc.nextDouble();
			System.out.printf("Seu depósito foi realizado com sucesso, saldo atual R$ %.2f%n");
		} else if (realizarDeposito == 'n' || realizarDeposito == 'N'){
			System.out.printf("Cadastro completo, saldo atual: R$ ");
		}
		
		sc.close();
	}
}
