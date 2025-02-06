package divisao_de_pares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double divisao = a / b;
			
			if (b == 0) {	
				System.out.println("divisao impossivel");
			} else {
				System.out.println(divisao);
			}
				
		}
			
			
			
		sc.close();

	}

}
