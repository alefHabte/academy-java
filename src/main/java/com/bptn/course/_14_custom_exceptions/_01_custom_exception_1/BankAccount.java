package com.bptn.course._14_custom_exceptions._01_custom_exception_1;

public class BankAccount {
	private double balance;
	private String accountNumber;

	public BankAccount(double balance, String accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}


	public void withdraw(double amount) throws InsufficientFundsExceptions {
		if (amount > balance) {
			double needs = amount - balance;
			throw new InsufficientFundsExceptions(needs);
		}
		balance -= amount;
		System.out.println("Withdraw of $" + amount + " successful.");

	}

}
