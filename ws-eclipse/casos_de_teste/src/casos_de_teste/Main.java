package casos_de_teste;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			double v1 = sc.nextDouble();

			int peco1 = 2;
			int peco2 = 3;
			int peco3 = 5;
			double media = (v1 * 2 + v1 * 3 + v1 * 5);
			double pecototal = peco1 + peco2 + peco3;
			double mediaponder1 = media / pecototal;
			System.out.println(mediaponder1);
		}

		sc.close();

	}

}
