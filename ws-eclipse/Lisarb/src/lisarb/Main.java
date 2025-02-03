package lisarb;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		if (salario < 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.00 && salario < 3000.00) {
			System.out.println("");
		}
		
		
		sc.close();

	}

}
