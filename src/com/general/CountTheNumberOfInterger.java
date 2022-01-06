package com.general;

import java.util.Arrays;
import java.util.List;

/**
 * Program to count the number of integer.
 * Input : 46783210876 
 * Count the occourrance of 8
 * 
 * @author Vinod Yadav
 *
 */
public class CountTheNumberOfInterger {

	public static void main(String[] args) {
		String num = "46783210876";
		int number = 8;
		int count = 0;
		
		for (int i =0; i< num.length(); i++) {
			if (Integer.valueOf(String.valueOf(num.charAt(i)))
					.equals(Integer.valueOf(number))) {
				count++;
			}
		}
		
		System.out.println("Count : "+count);
		
		List<String> list = Arrays.asList(num);
		Long new_count = list.stream().filter(n -> Integer.valueOf(String.valueOf(n))
				.equals(Integer.valueOf(number))).count();
		
		System.out.println("new_count : "+new_count);
	}

}
