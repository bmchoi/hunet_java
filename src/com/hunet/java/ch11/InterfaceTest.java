package com.hunet.java.ch11;

interface IShape {
	public String color = "red";
	
	void Draw();
}

class Circle implements IShape {
	private String type;
	
	public Circle(String type) {
		this.type = type;
	}
	
	@Override
	public void Draw() {
		System.out.println(color + "의 " + type + "을 그립니다.");
		
	}
}

class Rect implements IShape {
	private String type;
	
	public Rect(String type) {
		this.type = type;
	}

	@Override
	public void Draw() {
		System.out.println(color + "의 " + type + "을 그립니다.");
		
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		IShape[] is = new IShape[2];
		is[0] = new Circle("원");
		is[1] = new Rect("사각형");
		
		for(IShape r : is) {
			r.Draw();
		}
		
	}

}
