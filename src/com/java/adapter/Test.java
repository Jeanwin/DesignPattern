package com.java.adapter;

public class Test {
	public static void main(String[] args) {
		Adapter ad = new Adapter(new Adaptee());
		ad.adapteeMethod();
		ad.adapterMethod();
	}
}
