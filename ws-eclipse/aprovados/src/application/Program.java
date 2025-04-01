package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String [] vectname = new String[n];
		double [] vectnota1 = new double[n];
		double [] vectnota2 = new double[n];
		
		double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i+1);
			sc.nextLine();
			vectname[i] = sc.nextLine();
			vectnota1[i] = sc.nextDouble();
			vectnota2[i] = sc.nextDouble();
			
		}
		
		System.out.println("Alunos aprovados:");
		for(int i=0; i<n; i++) {
			sum = (vectnota1[i] + vectnota2[i]) / 2;
			if(sum >= 6.0) {
				System.out.println(vectname[i]); 
			} 
		}
		sc.close();
	}
}
