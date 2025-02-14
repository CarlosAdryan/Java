package entities;

public class DadosBacarios {
	private static final double taxa = 5.00;
	private double saldo;
	private double deposit;
	private double saque;
	private double saldoum;
	
	public DadosBacarios (double saldo, double deposit) {
		this.saldo = saldo;
		this.deposit = deposit;
	}
	
	
	public double depositos() {
		return saldo + deposit;
	}
	
	public DadosBacarios (double saldo, double saldoum, double saque) {
		this.saldoum = saldoum;
		this.saque = saque;
	}

	

}
