package PigLatinPackage;

public class PigLatin {
	
 import java.util.*;
 
	public static void main(String[] args) {
		String word = "";
		String pigLatin = "";
		String phrase = "a";
		System.out.println("This will program will convert your phrase to pig-latin.");
		while(phrase != "") {
		Scanner console = new Scanner(System.in);
		System.out.println("What is your phrase?");
		phrase = console.nextLine();
		//while(begin == phrase.length - 1)
		String wordcut	= convertPhrase(phrase, word);
		pigLatin = convertWord(wordcut, pigLatin);
		System.out.println(pigLatin);
		}
		
	}
	
	public static String convertPhrase(String phrase, String word) {
		int begin = 0;
		for(int i = 0; i < phrase.length();i++) {
			char charLetter = phrase.charAt(i);
				if(charLetter == ' ' || charLetter == phrase.length()) {
					word = phrase.substring(begin, i);
					begin = i - 1;
					convertWord();
					
		}
		return word;
		}

	}
	public static String convertWord(String wordcut, String pigLatin) {
		int begin = 0;
		for(int i = 0; i < wordcut.length();i++ ) {
			char charLetter = wordcut.charAt(i);
			if(charLetter == 'a' || charLetter == 'e'||charLetter == 'i'||charLetter == 'o'||charLetter == 'u') {
				String end = wordcut.substring(i,wordcut.length());
				String front = wordcut.substring(begin, i);
				pigLatin = (end + "-" + front + "ay" );
				begin = i;
			}
		}
		return pigLatin;
	
	}

}