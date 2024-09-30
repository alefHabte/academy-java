package com.bptn.course._01_week_1_Big_Coding;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a number");
		int targetNumber = 23;
		int num = 0;
		while (num != targetNumber) {
			num= scanner.nextInt();

		if (1 <= num && num <= 100) {
			if (num > targetNumber) {
				System.out.println("Too high! Try again.");
			} else if (num < targetNumber) {
				System.out.println("Too low! Try again.");

			} else {
				System.out.println("Congratulations! You guessed the number correctly!");
			} 
		}else {
			System.out.println("Please enter a number between 1 and 100.");
		}
	}

		// TODO Auto-generated method stub
	scanner.close();

	}

}
// I set the target and initialized the scanner I then implemented a while loop to check if the number entered was in the bound from 1 to 100
// I then checked the number against the target value and gave out the messages accordingly I finally closed the scanner
// this program was a simple guessing program that provided feedback on whether the guess is too high or too low
//the challenge was to keep the game interactive until the number is guessed correctly.
// In future tasks I will continue to ensure proper input validation and use for loops for repeated tasks in user-interactive programs