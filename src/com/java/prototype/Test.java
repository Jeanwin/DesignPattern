package com.java.prototype;

public class Test {
	public static void main(String[] args) {
		Prototype p1 = new ConcreatePrototype("prototype");
		Prototype p2 = (Prototype) p1.clone();
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}
}
