package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.Orderitem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		Client client = new Client(name, email, birthDate);
		Order order = new Order(OrderStatus.valueOf(status));

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		int teste = 0;
		double preco  = 0;
		for(int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			Orderitem items = new Orderitem(quantity, productPrice);
			order.addItem(product);
			teste = quantity;
			preco = productPrice;
			
		}
		
		Orderitem orderitem = new Orderitem(teste, preco);
			
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + sdf1.format(new Date()));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ")" + " - " + client.getEmail());
		System.out.println("Order items: ");
		
		for(Product product : order.getProduct()) {
			System.out.println(product.getName() + ", " + product.getPrice() +", Quantity: "+ orderitem.getQuantity() +", Subtotal: " );
		}
		
		
		sc.close();

	}

}
