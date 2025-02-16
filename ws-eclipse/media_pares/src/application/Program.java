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
		
		int i = 0;
		for(i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if(vect[i] % 2 == 0) {
				n - 1;
				sum += vect[i] /n;	
			} 
			
		}
		
		for(i=0; i<n; i++) {
			
		
		}
		
		System.out.printf("MEDIA DOS PARES = %.1f", sum);
		
		
		sc.close();

	}

}
