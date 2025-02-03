package codigo_e_preco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int itemcod = sc.nextInt();
		int itemquant = sc.nextInt();
		double total;
		
		if (itemcod == 1) {
			total = 4.00 * itemquant  ;
			System.out.printf("Total: R$ %.2f", total);
		} else if (itemcod == 2) {
			total = 4.50 * itemquant;
			System.out.printf("Total: R$ %.2f", total);
		} else if (itemcod == 3) {
			total = 5.00 * itemquant;
			System.out.printf("Total: R$ %.2f", total);
		} else if (itemcod == 4) {
			total = 2.00 * itemquant;
			System.out.printf("Total: R$ %.2f", total);
		} else if (itemcod == 5) {
			total = 1.50 * itemquant;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		
		sc.close();

	}

}
