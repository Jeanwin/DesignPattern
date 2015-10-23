package com.java.factory_abstract;

public class Test {
	public static void main(String[] args) {
		WhiteAnimalFactory waf = new WhiteAnimalFactory();
		BlackAnimalFactory baf = new BlackAnimalFactory();
		waf.getCat().eat();
		waf.getDog().eat();
		baf.getCat().eat();
		baf.getDog().eat();
	}
}
