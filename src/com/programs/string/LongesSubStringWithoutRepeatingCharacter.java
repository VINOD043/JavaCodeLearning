package com.programs.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the longest substring without repeating character
 * @author Vinod Yadav
 *
 */
public class LongesSubStringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		String str = "pwwkew";
		str = getSubstring(str);
		if (null != str || !str.isBlank())
			System.out.println("Longest substring without repeating character : "+ str);
	}
	
	private static String getSubstring(String str) {
		String output = "";
		if (null == str || str.isBlank())
			return str;
		
		for (int i =0; i< str.length(); i++) {
			List<Character> visited = new ArrayList<Character>();
			
			for (int j=i; j<str.length(); j++) {
				char ch = str.charAt(j);
				
				if (visited.contains(ch)) {
					break;
				} else {
					visited.add(ch);
				}
			}
			
			if (output.length() < visited.toString().length()) {
				output = visited.toString();
			}
		}
		
		return output;
	}

}
