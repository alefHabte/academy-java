package com.bptn.course._14_custom_exceptions._01_custom_exception_1;

public class InsufficientFundsExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;

	public InsufficientFundsExceptions(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}


}
