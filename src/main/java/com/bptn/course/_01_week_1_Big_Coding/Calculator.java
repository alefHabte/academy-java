package com.bptn.course._01_week_1_Big_Coding;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int continueCalculation = 1;
		while (continueCalculation == 1) {
		System.out.println("Press 1 for addition\r\n" + "Press 2 for subtraction\r\n" + "Press 3 for multiplication\r\n"
				+ "Press 4 for division\r\n" + "Press 5 to square a number\r\n" + "Press 6 to find a square root\r\n"
				+ "Press 7 to find the reciprocal");


			int input = scanner.nextInt();
		if (input == 1) {
			System.out.println("Enter the first number: ");
			double firstNum = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			double secondNum = scanner.nextDouble();
			System.out.println("The sum of " + firstNum + " and " + secondNum + " is = " + (firstNum + secondNum));

		} else if (input == 2) {
			System.out.println("Enter the first number: ");
			double firstNum = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			double secondNum = scanner.nextDouble();
			System.out
					.println("The difference of " + firstNum + " and " + secondNum + " is = " + (firstNum - secondNum));

		} else if (input == 3) {
			System.out.println("Enter the first number:");
			double firstNum = scanner.nextDouble();
			System.out.println("Enter the second number:");
			double secondNum = scanner.nextDouble();
			System.out.println(
					"The product of the numbers " + firstNum + " and " + secondNum + " is = " + firstNum * secondNum);
			System.out.println("To continue calculation Press 1, else press any other number to exit");

		} else if (input == 4) {
			System.out.println("Enter the first number: ");
			double firstNum = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			double secondNum = scanner.nextDouble();
			if (secondNum != 0) {
				System.out.println(
						"Dividing  " + firstNum + " by " + secondNum + " the quotient is " + (firstNum / secondNum));
				System.out.println("The remainder is " + firstNum % secondNum);
			} else {
				System.out.println("Division by zero is not allowed.");
			}

		}
		else if (input == 5) {
			System.out.println("Enter the number to find the Square: ");
			double num = scanner.nextDouble();
			System.out.println("The square of " + num + " is = " + (num * num));

		}
		else if (input == 6) {
			System.out.println("Enter the number to find the square root: ");
			double num = scanner.nextDouble();
			if (num >= 0) {
				System.out.println("The square root of " + num + " is = " + Math.sqrt(num));
			} else {
				System.out.println("Square root of negative numbers is not defined.");
			}

		}
		else if (input == 7) {
			System.out.println("Enter the number to find the Reciprocal: ");
			double num = scanner.nextDouble();
			if (num != 0) {
				System.out.println("The reciprocal of " + num + " is = " + (1 / num));
			} else {
				System.out.println("Reciprocal of zero is undefined.");
			}

		} else {
			System.out.println("Invalid choice! Please make a valid choice.");
		}
		System.out.println("To continue calculation Press 1, else press any other number to exit");
		 continueCalculation = scanner.nextInt();
		 
		

	}
		System.out.println("Thank you for using the calculator!");
		scanner.close();



	}
}

// I first started by creating a while loop that will repeatedly show a menu with the options and allow users to select what they want
// I put the if & else if  statement inside this loop where each choice will lead the user to perform their respective operation 
// for the division I added an error check to make sure the second number is not zero to prevent a zero division
// and for the square root I also checked if the number is not negative
// I also added a check in the reciprocal to make sure the divisor is not zero