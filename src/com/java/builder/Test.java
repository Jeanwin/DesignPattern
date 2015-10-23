package com.java.builder;

public class Test {
	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector();
		Person p = pd.constructPerson(new ManBuilder());
		System.out.println(p.getHead());
		System.out.println(p.getBody());
		System.out.println(p.getFoot());
	}
}
