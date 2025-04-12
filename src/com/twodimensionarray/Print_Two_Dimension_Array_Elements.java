package com.twodimensionarray;

public class Print_Two_Dimension_Array_Elements {
	public static void main(String[] args) {
		int [][] arr=new int[][] {{1,2,32,43},{34,55,66,7},{32,67,89,90}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
