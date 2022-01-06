package com.general;
import java.util.stream.IntStream;

/**
 * Print all the integers, that are divisible by 2, using java 8.
 * 
 * @author Vinod Yadav
 *
 */
public class DivisibleBy_02 {

	public static void main(String[] args) {
		/*IntStream.rangeClosed(2, 20).forEach(n -> {
			if (n%2 == 0) {
				System.out.println(n+" is divisible by 2");
			}
		});*/
		
		IntStream.rangeClosed(0, 20)
			.filter(n -> (n%2 == 0))
			.forEach(n -> System.out.println(n));
	}

}
