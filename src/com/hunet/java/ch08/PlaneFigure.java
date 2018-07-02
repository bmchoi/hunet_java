package com.hunet.java.ch08;

public class PlaneFigure {
	double base = 5.0;
	double height = 3.5;
	
	public double getArea() {
		return (base*height)/2.0;
	}
	public double getHypotenuse() {
		return Math.sqrt(base*base+height*height);
	}
	public double getPerimeter() {
		return base+height+getHypotenuse();
	}
	public static void main(String[] args) {
		PlaneFigure ob = new PlaneFigure();
		System.out.printf("삼각형의넓이 : %.2f\n", ob.getArea());
		System.out.printf("빗변길이 : %.2f\n", ob.getHypotenuse());
		System.out.printf("둘래길이 : %.2f\n", ob.getPerimeter());
	}
}
