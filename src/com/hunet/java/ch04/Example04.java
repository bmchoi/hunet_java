package com.hunet.java.ch04;

public class Example04 {
	public static void main(String[] args) {
		int i = 1;
		int odd = 0, even = 0;
		while(i <= 100) {
			if(i%2 == 0) even += i;
			else odd += i;
			i++;
		}
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
	}
}
