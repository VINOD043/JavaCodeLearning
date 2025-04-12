package com.array;

public class Copy_Elements_Of_Array_Inanother_Array {
	public static void main(String[] args) {
		int [] arr=new int[] {1,12,23,43,55};
		int [] arr1=new int[arr.length];
		System.out.println("Elements of arr1");
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
			System.out.println(arr1[i]);
		}
	}

}
