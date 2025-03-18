package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("enter the contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate ldt = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Contract value: ");
		Double contractvalue = sc.nextDouble();
		System.out.print("Enter the number of installments: ");
		int installments = sc.nextInt();
		System.out.println("Installments: ");
		
		Contract obj = new Contract(number, ldt, contractvalue);
		ContractService service = new ContractService(null);
		service.processContract(obj, installments);
		
		OnlinePaymentService services = new PaypalService();
		ldt = ldt.plusMonths(1);
		
		for (int i = 1; i <= installments; i++) {		
			System.out.println(fmt.format(ldt) + " - " + services.paymentFee(services.interest(200.00, i)));
			 ldt = ldt.plusMonths(1);
		}
		
		
		
		
		sc.close();
	}
		
		
}
