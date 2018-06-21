package com.hunet.java.ch06;

public class ArrayTest02 {
	public static void main(String[] args) {
		int[][] ar = new int[][] {{10,20,30},{40,50,60}};
		System.out.println("ar.lenght=" + ar.length);
		System.out.println("ar[0].lenght=" + ar[0].length);
		System.out.println("ar[1].lenght=" + ar[1].length);
		for(int[] rows : ar) {
			for(int col : rows) {
				System.out.printf("%3d",col);
			}
			System.out.println();
		}
	}
}
