package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 double x = sc.nextDouble();
		 double z = sc.nextDouble();
		 double y = sc.nextDouble();
		 
		double area = x * z ;
		double preco = area * y;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
		
		}
}
