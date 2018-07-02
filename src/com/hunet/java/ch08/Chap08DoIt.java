package com.hunet.java.ch08;

public class Chap08DoIt {
	int bookprice = 30000;
	
	public double getValue() {
		return bookprice -(bookprice*0.25);
	}
	public static void main(String[] args) {
		Chap08DoIt sale = new Chap08DoIt();
		System.out.printf("책값은 : %.0f원 입니다.",sale.getValue());
	}
}
