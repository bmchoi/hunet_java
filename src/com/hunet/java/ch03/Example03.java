package com.hunet.java.ch03;

public class Example03 {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 100 ; i++) {
			if((10|i) == 10) {
				if((10&i) == 2) {
					System.out.println(i);
				}
			}
		}
	}
}
