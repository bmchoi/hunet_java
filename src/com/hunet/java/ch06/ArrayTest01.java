package com.hunet.java.ch06;

public class ArrayTest01 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6};
		int[] newnums = new int[6];
		System.arraycopy(nums, 0, newnums, 0, nums.length);
		for(int num : newnums) {
			System.out.printf("%5d",num*2);
		}
	}
}