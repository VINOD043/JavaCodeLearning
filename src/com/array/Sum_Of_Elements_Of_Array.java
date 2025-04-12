package com.array;

public class Sum_Of_Elements_Of_Array {
	public static void main(String[] args) {
		int[] arr=new int[] {11,12,21,32,44,45};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Total sum of elements of array arr is " + sum);
	}

}
