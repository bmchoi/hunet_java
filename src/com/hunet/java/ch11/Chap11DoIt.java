package com.hunet.java.ch11;

public class Chap11DoIt {

	public static void main(String[] args) {
		SayHello[] sh = new SayHello[2];
		sh[0] = new SayHelloEng();
		sh[1] = new SayHelloKo();
		
		for(SayHello r : sh) {
			r.print();
		}
	}

}
