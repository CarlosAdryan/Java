package respectivo_fatorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int N = sc.nextInt();
		int X = N * (N-1) * (N-2) * (N-3);
		if (X == 1 || X == 0) {
		X = 1;
		}
		System.out.println(X);
		
		sc.close();

	}

}
