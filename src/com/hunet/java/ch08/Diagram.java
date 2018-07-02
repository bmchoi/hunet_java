package com.hunet.java.ch08;

public class Diagram {
	double size;
	
	public void area(int r) {
		size = r*r*Math.PI;
		System.out.printf("\n원의 넓이 : %.2f",size);
	}
	public void area(int a, int b) {
		size = (double)a*b;
		System.out.printf("\n사각형의 넓이 : %.2f",size);
	}
	public void area(int a, int b, int c) {
		size = (double)(a+b)*c/2;
		System.out.printf("\n사다리꼴의 넓이 : %.2f",size);
	}

	public static void main(String[] args) {
		Diagram p = new Diagram();
		p.area(3);
		p.area(4,5);
		p.area(3,4,7);
	}
}
