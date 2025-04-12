package com.twodimensionarray;

public class Product_Of_Sum_Of_Each_Elements {
	public static void main(String[] args) {
		int [][] arr=new int[][] {{2,1,2},{11,43,12,11},{1,2,3,4},{7,8,9,5}};
		int sum=0;
		int prod=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				prod=prod*arr[i][j];
				sum=sum+prod;
			}
			
		}
		System.out.println("sum of product of each elements " + sum);
	}

} 
