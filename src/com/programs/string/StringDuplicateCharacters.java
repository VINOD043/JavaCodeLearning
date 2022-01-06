package com.programs.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The program prints duplicate characters from string.
 * E.g. input = "Java", output = a. 
 * @author Vinod Yadav
 *
 */
public class StringDuplicateCharacters {

	public static void main(String[] args) {
		String string = "java";
		List<Character> lst = getDuplicateCharacters(string);
		System.out.println("Duplicate characters are : ");
		lst.forEach(c -> {
			System.out.println(c);
		});
		
		System.out.println("------- using java 8 ---------");
		List<Character> list = getDuplicateCharactersUsingJDK8(string);
		System.out.println("Duplicate characters are : ");
		list.forEach(c -> {
			System.out.println(c);
		});
	}
	
	private static List<Character> getDuplicateCharactersUsingJDK8(String string) {
		Set<Character> set = new HashSet<Character>();
		if (string.isEmpty() || string == null)
			System.out.println("String is empty");
		
		IntStream is = string.chars();
		 List<Character> list = is.mapToObj(ch -> (char)ch)
				 			.filter(s -> !set.add(s))
				 			.collect(Collectors.toList());
		 return list;
	}

	private static List<Character> getDuplicateCharacters(String string) {
		Set<Character> set = new HashSet<Character>();
		List<Character> list = new ArrayList<Character>();
		string = string.toLowerCase();
		if (string.isEmpty() || string == null)
			return list;
		
		for (int i = 0; i<string.length(); i++) {
			char ch = string.charAt(i);
			if (!set.add(ch)) {
				list.add(ch);
			}
		}
		
		return list;
	}

}
