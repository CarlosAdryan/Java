package model.entities;

import java.time.LocalDate;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	private double amount;
	private double installment;
	
	public Contract(Integer number, LocalDate date, Double totalValue, double amount, double installment) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.amount = amount;
		this.installment = installment;
	}
	
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getInstallment() {
		return installment;
	}

	public void setInstallment(double installment) {
		this.installment = installment;
	}
	
	
	
}
