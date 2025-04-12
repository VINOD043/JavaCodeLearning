package com.array;

public class Even_Elemets_From_Array {
	public static void main(String[] args) {
		int[] arr=new int[] {45,90,11,23,43,57,120};
		System.out.println("Even elements are");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				System.out.println(arr[i]);
			}
		}
	}

}
