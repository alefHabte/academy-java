package com.bptn.course._01_week_1_Big_Coding;
import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word you want to encrypt");
		String word = scanner.nextLine();
		String newWord = "";
		

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'z') {
				newWord += 'a';
			} else if (ch == 'Z') {
				newWord += 'A';
			}
			
			else if ((ch >= 'a' && ch <= 'y') || (ch >= 'A' && ch <= 'Y')) {
				newWord += (char) (ch + 1);
			} else {
				newWord += ch;
		}

		}
		System.out.println("Encrypted word:" + newWord);

		scanner.close();
	}

}

// I received the string the user inserted then I looped through the string, while looping I made sure to pick and shift 
// the 'z' && 'Z' character to make sure the wrap around is implemented correctly, this created some complexity.
// I also made sure only the characters that are alphabets are shifted, I then concatenated the results to display the encrypted result