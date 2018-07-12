package com.hunet.java.ch12;

public class Exception01 {
	public static void main(String[] args) {
		int i = 0;
		int b = 100;
		int res = 0;
		
		try {
			res = b/i;
		}catch (ArithmeticException e) {
			System.out.println(e.toString());
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("반드시 실행");
		}
		
		System.out.println("res = " + res);
	}
}
