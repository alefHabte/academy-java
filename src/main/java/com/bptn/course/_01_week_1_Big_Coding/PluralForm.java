package com.bptn.course._01_week_1_Big_Coding;

import java.util.Scanner;
public class PluralForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter a non negative number");
		int amt = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter a singular noun");
		String word = scanner.nextLine();
		 String pluralWord;
			if (amt == 1) {
				pluralWord = word;
			} else {
				if (word.endsWith("fe")) {
					pluralWord = word.substring(0, word.length() - 2) + "ves";


				} else if (word.endsWith("y") && !(word.endsWith("ay") || word.endsWith("ey") || word.endsWith("oy")
						|| word.endsWith("uy"))) {

					pluralWord = word.substring(0, word.length() - 1) + "ies";
				} else if (word.endsWith("sh") || word.endsWith("ch")) {

					pluralWord = word + "es";
				} else if (word.endsWith("us")) {

					pluralWord = word.substring(0, word.length() - 2) + "i";
				} else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {

					pluralWord = word + "s";
				} else {

					pluralWord = word + "s";
				}

	}
	System.out.println(amt + " " + pluralWord);

	scanner.close();

}
}
//The program allows a user to input a non negative integer and a singular noun, then correctly applying pluralization based on the ending and putting the number in front 
//I first used an if statment to cheak if the number is not equal to one I then proceeded with applying the rules using the substring and endwith methods 
//The new aspect of this program was learning pluralization rules especially those ending with "y","us", and "fe"
//I encounter challenge the correct order were checked in the proper order to avoid errors 
//For future projects I have understood the importance of testing different inputs thoroughly to validate all the cases
