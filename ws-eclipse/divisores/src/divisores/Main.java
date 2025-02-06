package divisores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double X = sc.nextDouble();
		for (int i = 0; i <= X; i++) {
			if (X % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
