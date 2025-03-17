package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("enter the contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.println("Date (dd/MM/yyyy): ");
		LocalDateTime teste = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Valor do contrato: ");
		Double contractvalue = sc.nextDouble();
		System.out.println("Enter the number of installments: ");
		int installments = sc.nextInt();
		System.out.println("Installments: ");
		
		Contract obj = new Contract(number, teste, contractvalue);
		ContractService service = new ContractService(null);
		service.processContract(obj, installments);
		
		sc.close();
	}
		
		
}
