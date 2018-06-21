package com.hunet.java.ch06;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[][] myArray = new int[3][];
		myArray[0] = new int[] {1,2,3};
		myArray[1] = new int[] {5,4,3,2,1};
		myArray[2] = new int[] {11,22};
		for(int[] rows : myArray) {
			for(int col : rows) {
				System.out.printf("%3d",col);
			}
			System.out.println();
		}
	}
}
