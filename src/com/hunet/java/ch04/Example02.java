package com.hunet.java.ch04;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		char op = '\0';
		
		a = sc.nextInt();
		b = sc.nextInt();
		op = sc.next().charAt(0);
		
		switch (op) {
		case '+':
			System.out.println(a + "+" + b + "=" + (a+b));
			break;
		case '-':
			System.out.println(a + "-" + b + "=" + (a-b));
			break;
		case '*':
			System.out.println(a + "*" + b + "=" + (a*b));
			break;
		case '/':
			System.out.println(a + "/" + b + "=" + (a/b));
			break;
		default:
			System.out.println("연산자 오류 : op = " + op);
		}
		
		sc.close();
	}
}
