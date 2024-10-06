package com.bptn.course._14_custom_exceptions._01_custom_exception_1;

public class Main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(1000, "43589");
		try {
		ba.withdraw(90);
		ba.withdraw(900);
		ba.withdraw(500);
	} catch (InsufficientFundsExceptions e) {
		System.out.println("Insufficient Fund, You need $" + e.getAmount() + "more to complete this transaction");

	}

	}

}
