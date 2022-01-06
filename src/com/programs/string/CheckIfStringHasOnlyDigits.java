package com.programs.string;

/**
 * Check if the String is numeric.
 * E.g. input="123", output = string is numeric
 * E.g. input="123a", output = string is not numeric
 * @author Vinod Yadav
 *
 */
public class CheckIfStringHasOnlyDigits {

	public static void main(String[] args) {
		String str = "123";
		boolean isNumeric = isStringNumeric(str);
		if (isNumeric) {
			System.out.println("String is numeric");
		} else {
			System.out.println("String is not numeric");
		}
	}
	
	@SuppressWarnings("unused")
	private static boolean isStringNumeric(String str) {
		if (str == null)
			return false;
		
		try {
			double d = Double.valueOf(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

}
