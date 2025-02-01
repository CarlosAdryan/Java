package funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int horast = sc.nextInt();
		double recibo = sc.nextDouble();
		
		double salario = (horast * recibo);
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();

	}

}
