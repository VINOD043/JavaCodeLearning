package com.twodimensionarray;

public class Sum_Of_Each_Elements {
	public static void main(String[] args) {
		int [][] arr=new int[][] {{12,34,45,55},{11,21,32,15},{61,16,17,80}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
				
			}
		}
		System.out.println("Sum of each elements is " + sum);
	}

}
