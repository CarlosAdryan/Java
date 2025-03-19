package model.entities;

import java.time.LocalDate;

public class installment {
	
	private LocalDate dueDate;
	private Double amount;
	
	private Contract contract;

	public installment(LocalDate dueDate, Double amount, Contract contract) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
		this.contract = contract;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	
	
	
	
	
	
}
