package sequencia_impares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor de X: ");
		int X = sc.nextInt();
		
		for ( int i = 1; i < X; i += 2 ) {
			if (X % 2 == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();

	}

}
