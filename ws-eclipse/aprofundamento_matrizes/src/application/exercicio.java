package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		double[][] mat = new double[n][n];
		
		System.out.println("Digite os valores da matriz:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma += mat[i][i];
		}
		System.out.println("Soma da diagonal principal = " + soma);
		
		
		
		sc.close();

	}

}
