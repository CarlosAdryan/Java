package quantidade_e_valores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int npeca1 = sc.nextInt();
		double preco1 = sc.nextFloat();
		int codigo2 = sc.nextInt();
		int npeca2 = sc.nextInt();
		double preco2 = sc.nextFloat();
		
		double primeiro = preco1 * npeca1;
		double segundo = preco2 * npeca2;
		double apagar =  primeiro + segundo;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", apagar);
		
		sc.close();

	}

}
