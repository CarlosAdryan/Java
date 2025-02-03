package tempo_de_jogo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hinicial = sc.nextInt();
		int hfinal = sc.nextInt();
		int tmpjogo;
		
		if (hinicial < hfinal) {
			tmpjogo = hinicial - hfinal;
		} else {
			tmpjogo = 24 - hinicial + hfinal;
		}
		System.out.println("O JOGO DUROU "+ tmpjogo +" HORAS(S)");
		
		sc.close();

	}

}
