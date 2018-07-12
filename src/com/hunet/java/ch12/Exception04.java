package com.hunet.java.ch12;

import java.util.Scanner;

class YourOwn extends Exception {
	public String toString() {
		return "음수 입니다.";
	}
}

public class Exception04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int i = sc.nextInt();
			if(i < 0) 
				throw new YourOwn();
			System.out.println(i);
		}catch (YourOwn m) {
			System.out.println(m.toString());
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
