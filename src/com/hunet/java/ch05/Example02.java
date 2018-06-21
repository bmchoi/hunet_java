package com.hunet.java.ch05;

public class Example02 {
	public static void main(String[] args) {
		for(int i=1; i<=17; i+=4) {
			for(int j=0; j<=3;j++) {
				System.out.printf("%5d",i+j);
			}
			System.out.println();
		}
	}
}
