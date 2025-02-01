package raio_de_um_circulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextFloat();
		
		double pi = 3.14159;
		raio = Math.pow(raio, 2.0);
		double area = pi * raio;
		
		System.out.printf("A = %.4f", area);
	}

}
