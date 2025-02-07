package maior;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();
		
		if (N1 > N2 && N2 > N3) {
			System.out.println("Higher = " + N1);
		} else if (N2 > N1 && N2> N3) {
			System.out.println("Higher = " + N2);
		} else if (N3 > N1 && N3> N2) {
			System.out.println("Higher = " + N3);
		}
		
		sc.close();

	}

}
