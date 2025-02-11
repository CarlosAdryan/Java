package contacao;

import java.util.Locale;
import java.util.Scanner;

import calculos.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
			double dollarprice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
			double dollarbought = sc.nextDouble();
			double topay = CurrencyConverter.testando(dollarprice, dollarbought);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", topay);
		
		sc.close();

	}

}
