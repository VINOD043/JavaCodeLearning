package com.programs.string;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * String s = "INDIA"
 * Write Java8 code to count the number of 'I' in the given string.
 * 
 * @author Vinod Yadav
 *
 */
public class WordCount {

	public static void main(String[] args) {
		String string = "INDIA";
		
		/**Using java 7*/
		System.out.println("------- Using java 7 ------------");
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.toString(string.charAt(i)).equalsIgnoreCase("I")) {
				count++;
			}
		}
		System.out.println("Count of I : "+count);
		
		System.out.println("------- Using java 8 ------------");
		IntStream chars = string.chars();
		long countOfI = chars.mapToObj(ch -> (char)ch)
				.filter(s -> String.valueOf(s).equalsIgnoreCase("I"))
				.count();
		System.out.println("Count of I : "+countOfI);
	}

}
