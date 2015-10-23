package com.java.adapter;

public class Adapter implements Target {
	private Adaptee at;

	public Adapter(Adaptee att) {
		this.at = att;
	}

	@Override
	public void adapteeMethod() {
		at.adapteeMethod();
	}

	@Override
	public void adapterMethod() {
		System.out.println("this is adapterMethod");
	}

}
