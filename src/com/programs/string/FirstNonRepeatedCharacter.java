package com.programs.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string find the first non repeated character from the string.
 * E.g input = "geeksforgeeks", output = f
 * E.g input = "Morning", output = M
 * @author Vinod Yadav
 *
 */
public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String string = "geeksforgeeks";
		char firstUniqueCharacter = ' ';
		//Step 1. store all the characters in a map with their count
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch,1);
			} else {
				map.put(ch, map.get(ch)+1);
			}
		}
		
		//Step 2. iterate the string again and check the count in map
		// if its = 1, its the first unique character
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (map.get(ch) == 1) {
				firstUniqueCharacter = ch;
				break;
			}
		}
		System.out.println("First unique character : "+firstUniqueCharacter);
	}

}
