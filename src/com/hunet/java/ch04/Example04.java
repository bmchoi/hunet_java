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
		System.out.println("Â¦¼öÀÇ ÇÕ : " + even);
		System.out.println("È¦¼öÀÇ ÇÕ : " + odd);
	}
}
