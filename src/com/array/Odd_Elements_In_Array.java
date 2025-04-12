package com.array;

public class Odd_Elements_In_Array {
	public static void main(String[] args) {
		int[] odd=new int[] {31,32,34,56,78};
		System.out.println("Odd Elements in Array ");
		for(int i=0;i<odd.length;i++) {
			if(odd[i]%2!=0) {
				System.out.println(odd[i]);
			}
		}
	}

}
