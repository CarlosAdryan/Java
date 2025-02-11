package verificador_de_aprovação;

import java.util.Locale;
import java.util.Scanner;
import entities.Sumario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Sumario verificador = new Sumario();
		verificador.name = sc.nextLine();
		verificador.not1 = sc.nextDouble();
		verificador.not2 = sc.nextDouble();
		verificador.not3 = sc.nextDouble();
		
		if (verificador.notfinal() > 60) {
		System.out.printf("FINAL GRADE = %.2f%n", verificador.notfinal());
		System.out.println("PASS"); 
		} else if (verificador.notfinal() < 60){
			System.out.printf("FINAL GRADE = %.2f%n", verificador.notfinal());
			System.out.println("FAILED"); 
			System.out.printf("MISSING %.2f", verificador.falta(), "POINT");
		}
		
		
		
		sc.close();

	}

}
