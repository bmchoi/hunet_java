package com.hunet.java.ch06;

public class ArrayTest04 {
	public static void main(String[] args) {
		int[] Array = new int[] {10,20,30,40,50,0};
		int sum = 0;
		for(int num : Array) {
			if(num == 0) break;
			System.out.printf("%3d",num);
			sum += num;
		}
		System.out.printf(" %3d",sum);
	}
}
