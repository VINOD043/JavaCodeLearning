package com.programs.string;
import java.util.Scanner;
import java.util.Stack;

public class BalancedStringExample {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		boolean isStringBalanced = isStringBalanced(str);
		if (isStringBalanced) {
			System.out.println("String is balanced");
		} else {
			System.out.println("String is not balanced");
		}
		scan.close();
	}

	static private boolean isStringBalanced(String str) {
		if (null == str || str.isBlank())
			return false;
		
		Stack<Character> stack = new Stack<Character>();
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
				continue;
			}
			
			if (stack.empty())
				return false;
			
			char popVal;
			if (ch == '}' || ch == ']' || ch == ')') {
				
				switch (ch) {
					case '}' :
						popVal = stack.pop();
						if (popVal == '[' || popVal == '(') 
							return false;
						break;
					case ']' :
						popVal = stack.pop();
						if (popVal == '{' || popVal == '(') 
							return false;
						break;
					case ')' :
						popVal = stack.pop();
						if (popVal == '{' || popVal == '[') 
							return false;
						break;
				}
			}
		}
		return stack.empty();
	}
}
