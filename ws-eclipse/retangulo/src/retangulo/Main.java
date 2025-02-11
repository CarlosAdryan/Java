package retangulo;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();		
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		double area = rectangle.area();
		System.out.printf("AREA = %.2f%n", area);
		double perimeter = rectangle.perimeter();
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		double diagonal = rectangle.diagonal();
		System.out.printf("PERIMETER = %.2f%n", Math.sqrt(diagonal));
			
		sc.close();
	}

}
