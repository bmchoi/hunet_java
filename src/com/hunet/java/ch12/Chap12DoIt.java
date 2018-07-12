package com.hunet.java.ch12;

public class Chap12DoIt {
	
	public static void prn() throws Exception {
		new Exception();
	}

	public static void main(String[] args) {
		try {
			prn();
		}catch (Exception e) {
			System.out.println(e.toString());;
		}
	}
}
