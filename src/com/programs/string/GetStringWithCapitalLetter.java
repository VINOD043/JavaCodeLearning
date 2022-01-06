package com.programs.string;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vinod Yadav
 * 
 * Get all the cities starting with Capital letter.
 *
 */
public class GetStringWithCapitalLetter {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bangalore", "mysore","Pune", "chennai");
		
		list.stream()
			.filter(c -> Character.isUpperCase(c.charAt(0)))           // Check the first character of each string if capital
			.collect(Collectors.toList())                              // Collect to a list
			.forEach(System.out :: println);                           // Print
		
	}

}
