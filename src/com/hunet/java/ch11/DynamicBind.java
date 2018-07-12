package com.hunet.java.ch11;

import java.util.Scanner;

abstract class Base {
	public abstract void start();
	public abstract void stop();
}

class Cat extends Base {

	@Override
	public void start() {
		System.out.println("Cat 걸었네");
	}

	@Override
	public void stop() {
		System.out.println("Cat 멈추었네");
	}

}

class Duck extends Base {

	@Override
	public void start() {
		System.out.println("Duck 걸었네");
	}

	@Override
	public void stop() {
		System.out.println("Duck 멈추었네");
	}

}

class Puppy extends Base {

	@Override
	public void start() {
		System.out.println("Puppy 걸었네");
	}

	@Override
	public void stop() {
		System.out.println("Puppy 멈추었네");
	}

}

public class DynamicBind {
	public static void main(String[] args) {
		System.out.println("input no : [강아지 1, 야옹이 2, 오리 3]");

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

//******StaticBind
//		switch (no) {
//		case 1:
//			Puppy p = new Puppy();
//			p.start();
//			p.stop();
//			break;
//		case 2:
//			Cat c = new Cat();
//			c.start();
//			c.stop();
//			break;
//		case 3:
//			Duck d = new Duck();
//			d.start();
//			d.stop();
//			break;
//		}
		
//******DynamicBind
		Base base = null;
		
		switch (no) {
		case 1:
			base = new Puppy();
			break;
		case 2:
			base = new Cat();
			break;
		case 3:
			base = new Duck();
			break;
		}
		base.start();
		base.stop();
	}
}
