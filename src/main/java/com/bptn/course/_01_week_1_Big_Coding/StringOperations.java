package com.bptn.course._01_week_1_Big_Coding;
import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner =new Scanner(System.in);
		int input;

		do {
		System.out.println("/…String Menu…/\r\n"
				+ "Press 1 for Palindrome Check\r\n"
				+ "Press 2 to reverse a String\r\n"
				+ "Press 3 to Concatenate two Strings\r\n"
				+ "Press 4 for String Comparison\r\n"
				+ "Press 5 to Calculate the Length of String\r\n"
				+ "Enter the option:");
		 input = scanner.nextInt();
			scanner.nextLine();
		switch (input) {
		case 1:
			System.out.println("Palindrome Check");
			System.out.println("Enter a string:");
			String word = scanner.nextLine();
			String reversed = "";
			for (int i = 0; i < word.length(); i++) {
				reversed = word.charAt(i) + reversed;
			}

			if (word.equals(reversed)) {
				System.out.println(word + " is a palindrome");
			} else {
				System.out.println(word + " is not a palindrome");
			}


			break;
		case 2:
			System.out.println("Reverse String");
			System.out.println("Enter a string:");
			String original = scanner.nextLine();


			if (!original.equals(" ")) {
				StringBuilder input1 = new StringBuilder();
				input1.append(original);
				input1.reverse();
				System.out.println(input1);
			}
			break;
		case 3:
			System.out.println("Concatenate two Strings");
			System.out.println("Enter First string:");
			String firstString = scanner.nextLine();
			System.out.println("Enter Second string:");
			String secondString = scanner.nextLine();
			System.out.println(firstString + secondString);
			break;
		case 4:
			System.out.println("String Comparison");
			System.out.println("Enter First string:");
			String string1 = scanner.nextLine();
			System.out.println("Enter Second string:");
			String string2 = scanner.nextLine();
			if (string1.equals(string2)) {
				System.out.println("The entered strings are equal");
			} else {
				System.out.println("The entered strings are not equal");
			}
			break;
		case 5:
			System.out.println("Length of a string");
			System.out.println("Enter a string:");
			String stringInput = scanner.nextLine();
			int stringLength = stringInput.length();

			System.out.println("The length of the entered string is: " + stringLength);
			break;
		default:
			System.out.println("Invalid choice! Please make a valid choice.");
			break;
		}
		System.out.println();
	} while (input >= 1 && input <= 5);
		System.out.println("Thank you for using the string operations program!");
		scanner.close();		

	}

}
//I created a variable to store the user choice, then used that to do a case switch statement, go through each respective function, and check if that was what the user wanted to perform
//For the first case (the Palindrome), I stored the input in a variable and created another empty variable, then I looped through the given word took each character, and added it in front of the latter to create a reversed string of the word, then I compared it against the original word
//For the reverse string, I used the StringBuilder, which was a new way I learned to reverse a string
//For the comparison, I used the equals method
//For the length calculation, I used the length method 
//For error handling, if a user enters an invalid choice, an error message appeared
//I encountered a minor issue with handling input but solved it using the scanner.nextLine() appropriately