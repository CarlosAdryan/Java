package areas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double pi = 3.14159;
		
		double areat = (A * C)/2;
		double areac = pi * C * C;
		double areatp = (A + B)* C /2;
		double areaq = B * B;
		double arear = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f%n", areat);
		System.out.printf("CIRCULO: %.3f%n", areac);
		System.out.printf("TRAPEZIO: %.3f%n", areatp);
		System.out.printf("QUADRADO: %.3f%n", areaq);
		System.out.printf("RETANGULO: %.3f%n", arear);
		
		
		
		sc.close();

	}

}
