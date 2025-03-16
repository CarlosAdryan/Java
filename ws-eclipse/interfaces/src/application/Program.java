package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data");
		System.out.print("Model car: ");
		String carModel = sc.nextLine();
		System.out.println("Withdrawal (dd/MM/yyyy hh:mm): ");
		LocalDateTime start;
		
		
		sc.close();

	}

}
