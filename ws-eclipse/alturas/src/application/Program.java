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
		
		String names = null;
		double menoresq = 0;
		double media = 0;
		for (int i=0; i<n; i++) {
			System.out.println("Dados da "+i+"a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
			media += alturas[i];
			if (idades[i] < 16) {
				menoresq += i;	
				names = nomes[i];		
			}
		}
		System.out.println();
		double atm = media/n;
		System.out.printf("Altura média: %.2f%n", atm);
		
		double mq = (menoresq/n) *100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", mq);
		System.out.print(names);
		System.out.println(names);
		
		
	
		
		
		sc.close();

	}

}
