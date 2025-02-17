package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double [] vect = new double[n];
		
		double sum = 0;
		int tst = n;
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double npares = 0;
		double teste = 0;
		for(int i=0; i<n; i++) {
			if(vect[i] % 2 == 1) {
				tst -= 1;	
				
			} else if (vect[i] % 2 == 0) {
				sum += vect[i];
				teste = sum / tst;
				npares = vect[i];
				
			}
		}
		
		if (npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.printf("MEDIA DOS PARES = %.1f", teste);
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
