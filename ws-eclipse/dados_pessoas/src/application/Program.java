package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		
		double menor = 0.0;
		double maior = 0.0;
		double [] vectalt = new double[n];
		char[] vectgnr = new char[n];
		
		
		double nwomen = n;
		double sum = 0.0;
		int nmans = n;
		
		for(int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			vectalt[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			vectgnr[i] = sc.next().charAt(0);
		}
		
		menor = vectalt[0];
		
		for(int i=1; i<n; i++) {
			if(vectalt[i] < menor) {
				menor = vectalt[i];
			}
		}
		
		maior = vectalt[0];
		
		for(int i=1; i<n; i++) {
			if(vectalt[i] > maior) {
				maior = vectalt[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if (vectgnr[i] == 'F') {
				sum += vectalt[i];
			} else if (vectgnr[i] == 'M') {
				nwomen -= 1;
			}
		}
		
		double media = sum / nwomen;
		
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		
		for(int i=0; i<n; i++) {
			if (vectgnr[i] == 'F') {
				nmans -= 1;
			} 
		}
		System.out.printf("Numero de homens = %d", nmans);
		
		sc.close();

	}

}
