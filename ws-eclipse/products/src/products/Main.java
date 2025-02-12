package products;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Main {
	
		public String name;
		public double price;
		public int quantity;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Triangle triangle = new Triangle(name, price);
			
		System.out.println();
		System.out.println("Product data: "+ triangle);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		triangle.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: "+ triangle);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock:");
		int remove = sc.nextInt();
		triangle.removeProducts(remove);
		
		System.out.println();
		System.out.println("Update data: "+ triangle);
		
		sc.close();

	}

}
