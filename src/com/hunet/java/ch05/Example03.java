package com.hunet.java.ch05;

public class Example03 {
	public static void main(String[] args) {
		for(int i = 1; i <=30; i++) {
			if(i%3==0||i%7==0) {
				System.out.println();
				continue;
			}
			System.out.printf("%5d",i);
		}
	}
}
