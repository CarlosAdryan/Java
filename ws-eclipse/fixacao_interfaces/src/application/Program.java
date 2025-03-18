package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Contract> installments = new ArrayList<>();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
		
		System.out.println("enter the contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDateTime teste = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Contract value: ");
		Double contractvalue = sc.nextDouble();
		System.out.print("Enter the number of installments: ");
		int installment = sc.nextInt();
		System.out.print("Installments: ");
		
		Contract obj = new Contract(number, teste, contractvalue);
		ContractService service = new ContractService(null);
		service.processContract(obj, installment);
		
		OnlinePaymentService services = new PaypalService();
		
		System.out.println(services.interest(200.0, 3));
		System.out.println(services.paymentFee(services.interest(200.0, 1)));
		
		sc.close();
	}
		
		
}
