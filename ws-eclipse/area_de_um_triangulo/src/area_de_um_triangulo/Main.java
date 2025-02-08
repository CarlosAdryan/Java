package area_de_um_triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Enter the measures of triangle X:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double p = (a + b + c )/2;
		double o = p - a;
		double x = p - b;
		double i  = p - c;
		double semifinal = p * o * x * i;
		
		System.out.println("Enter the measures of triangle Y:");
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		double g = (d + e + f )/2;
		double h = g - d;
		double l = g - e;
		double k  = g - f;
		double damnfinal = g * h * l * k;
		
		
		System.out.print("Triangle X area: ");
		System.out.printf("%.4f%n", Math.sqrt(semifinal));
		
		System.out.print("Triangle Y area: ");
		System.out.printf("%.4f%n", Math.sqrt(damnfinal));
		
		
		if (damnfinal > semifinal) {
			System.out.println("Larger area: Y");
		} else {
			System.out.println("Larger area: X");
		}
		
		
		
		
		sc.close();

	}

}
