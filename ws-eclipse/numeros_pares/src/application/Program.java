package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		int quantidade = 0;
		for(int i = 0; i<n; i++){
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				quantidade += 1;				
			}
			
		}
		System.out.println();
		
		System.out.println("NUMEROS PARES:");
		for(int i = 0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d  ", vect[i]);
			}		
		}
		System.out.println();
		System.out.println();
		
		System.out.printf("QUANTIDADE DE PARES = %d", quantidade);
		
		sc.close();

	}

}
