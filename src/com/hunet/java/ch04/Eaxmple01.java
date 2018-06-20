package com.hunet.java.ch04;

import java.util.Scanner;

public class Eaxmple01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt();
		if(jumsu >= 90) System.out.println(jumsu + " = A");
		else if(jumsu >= 80) System.out.println(jumsu + " = B");
		else if(jumsu >= 70) System.out.println(jumsu + " = C");
		else System.out.println(jumsu + " = D");
		sc.close();
	}
}
