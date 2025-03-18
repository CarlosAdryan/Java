package model.services;

public class PaypalService implements OnlinePaymentService{
	
	
	
	public double interest(Double amount, Integer months) {
		double interestRate = 0.01 * months;
		return amount +  (amount * interestRate)  ;
	
	}
	
	public double paymentFee(Double amount) {
		return amount + (amount * 0.02);
	}
	

	

}
