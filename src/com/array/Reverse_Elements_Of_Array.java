package com.array;

public class Reverse_Elements_Of_Array {
	public static void main(String[] args) {
		int[] arr=new int[] {23,1,21,23,14,15};
		int[] reverse=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			reverse[j]=arr[i];
			j++;
		}
		System.out.println("Reverse of array arr elements");
		for(int i=0;i<reverse.length;i++) {
			System.out.println(reverse[i]);
		}
		
			
			
		}
		}
	


