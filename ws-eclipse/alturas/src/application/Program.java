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
		
		double menoresq = 0;
		double media = 0;
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
			media += alturas[i];
			if (idades[i] < 16 ) {
				menoresq += i;		
			}
		}
		System.out.println();
		double atm = media/n;
		System.out.printf("Altura média: %.2f%n", atm);
		
		double mq = (menoresq/n) *100;
		System.out.println("Pessoas com menos de 16 anos: "+mq+"%");
		
		for (int i=0; i<n; i++) {
			if(idades[i] < 16) {
				System.out.printf("%s \n", nomes[i]);
			}
		}
		
		
		
		
		
	
		
		
		sc.close();

	}

}
