package soma;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int A = a + b;
		
		System.out.println("SOMA = "+ A);
		
		sc.close();
		
	}
}
