package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String [] vectname = new String[n];
		int [] vectidd = new int[n];
		
		int maior = 0;
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			vectname[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectidd[i] = sc.nextInt();
		}
		
		maior = vectidd[0];
		
		for(int i=1; i<n; i++) {
			if(vectidd[i] > maior) {
				maior = vectidd[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(vectidd[i] == maior) {
				System.out.printf("PESSOA MAIS VELHA: %s", vectname[i]);
			}
		}
		
		
		
		sc.close();
	}

}
