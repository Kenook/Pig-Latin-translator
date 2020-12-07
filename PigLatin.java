package PigLatin;

import java.util.*;

public class PigLatin {

	public static void main(String[] args) {
		//The main method explains to the user what the program does and then prompts the user for input
		String phrase = "text";
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Welcome to the Pig Latin Translator\nThis program takes English and translates it to Pig Latin");
		while (phrase != "") {
			System.out.println("What is your phrase?");
			phrase = input.nextLine();
			convertPhrase(phrase);
			System.out.println("");
			System.out.println("");
		}
		input.close();
	}

	public static String convertPhrase(String phrase) {
		//The convertPhrase method takes the input and sends the words separately to the convertWord function
		String word = "";
		int begin = 0;
		for (int i = 0; i < phrase.length(); i++) {
			String theSubString = phrase.substring(i, i + 1);
			if (theSubString.equals(" ") || i+1 == phrase.length()) {
				word = phrase.substring(begin, i+1);
				begin = i;
				convertWord(word);
			}

		}
		return word;
	}

	public static String convertWord(String word) {
	//The convertWord method takes the word from convertPhrase and looks for a vowel, then applies the laws of pig latin to it
	//It then prints out the translated words
		String frontCut = "";
		String endCut = "";
		int begin = 0;
		String result = "";
		for (int j = 0; j < word.length(); j++) {
			String letter = word.substring(j, j + 1);
			if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o")
					|| letter.equals("u")) {
				frontCut = word.substring(begin, j);
				endCut = word.substring(j, word.length());
				result = endCut + "-" + frontCut + "ay";
				System.out.print(result + " ");
				return result;
			}
		}
		return result;
	}
}
