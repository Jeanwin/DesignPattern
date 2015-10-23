package com.zonekey.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance4();
		Singleton s2 = Singleton.getInstance4();
		System.out.println(s1.equals(s2));
	}
}
