package com.general;
import java.util.Arrays;

/**
 * Given a number sort it in descending order.
 * 
 * @author Vinod Yadav
 *
 */
public class SortNumberInDescendingOrder {

	public static void main(String[] args) {
		int res = solution(213);
		System.out.println(res);
	}
	
	public static int solution(int N) {
		char[] str = Integer.toString(N).toCharArray();
		Arrays.parallelSort(str);
		String reverse = new StringBuilder(new String(str)).reverse().toString();
		int result = 0;
		try {
			result = Integer.parseInt(reverse);
		} catch (Exception e) {
			return -1;
		}
		
		if (result > 100000000)
			return -1;
		
		return result;
	}

}
