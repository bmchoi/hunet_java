package com.hunet.java.ch05;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		System.out.println("Input Dan : ");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for(int i = 1;i<10;i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		sc.close();
	}
}
