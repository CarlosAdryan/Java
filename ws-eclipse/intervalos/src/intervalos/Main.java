package intervalos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double qualquer = sc.nextDouble();
		
		if (qualquer > 0 && qualquer <= 25.00 ) {
			System.out.println("Intervalo (0,25]");
		} else if (qualquer > 25.00 && qualquer <= 50.00) {
			System.out.println("Intervalo (25,50]");
		} else if (qualquer > 50.00 && qualquer <= 75.00) {
			System.out.println("Intervalo (50,75]");
		} else if (qualquer > 75.00 && qualquer <= 100.00) {
			System.out.println("Intervalo (75,100]");
		} else if (qualquer < 0) {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}
