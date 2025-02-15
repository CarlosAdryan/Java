package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String [] nomes = new String[n];
		int [] idades = new int[n];
		double [] alturas = new double[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da "+i+"a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
			double media = alturas[n] + alturas[i] / n;
			System.out.println(media);
		}
		
	
		
		
		sc.close();

	}

}
