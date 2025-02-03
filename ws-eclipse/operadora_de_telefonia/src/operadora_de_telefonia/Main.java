package operadora_de_telefonia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double minutos = sc.nextDouble();
		double valor = 50.00;
		double a;

		if (minutos > 100) {
			a = minutos - 100;
			valor = (a * 2) + valor;
			System.out.printf("Valor a pagar: R$ %.2f", valor);
		} else {
			System.out.printf("Valor a pagar: R$ %.2f", valor);
		}

		sc.close();
	}

}
