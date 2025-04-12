package com.twodimensionarray;

public class Addition_Of_Two_Matrics {
	public static void main(String[] args) {
		//creating two matrices
		int[][] a=new int[][] {{1,2,3,4},{4,5,6,7}};
		int[][] b=new int[][] {{2,3,4,5},{5,6,7,8}};
		//creating another matrix to store the sum of two matrices
		int[][] c=new int[2][4];
		//adding and printing addition of two matrices
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
