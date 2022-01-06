package com.programs.string;
import java.util.Arrays;
import java.util.Objects;

/**
 * Check if two strings are anagram of each other.
 * @author Vinod Yadav
 *
 */
public class Anagram {

	public static void main(String[] args) {
		String str1 = "Mother In Law";
		String str2 = " ";
		
		boolean isAnagram = checkIfAnagram(str1, str2);
		if (isAnagram) {
			System.out.println("String is anagram");
		} else {
			System.out.println("String is not anagram");
		}
	}
	
	private static boolean checkIfAnagram(String str1, String str2) {
		if (Objects.isNull(str1) || Objects.isNull(str2)) {
			return false;
		}
		
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");

		if (str1.length() != str2.length()) {
			return false;
		} else {
			// step 1: convert the string to lower/upper case -> sort the string
			char [] s1 = str1.toLowerCase().toCharArray();
			char [] s2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if (Arrays.equals(s1,s2)) {
				return true;
			}
		}
		return false;
		
	}

}
