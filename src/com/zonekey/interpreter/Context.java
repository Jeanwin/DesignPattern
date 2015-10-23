package com.zonekey.interpreter;

/**
 * 解释器模式用来做各种各样的解释器，如正则表达式等的解释器
 * 
 * @author admin
 * 
 */
public class Context {

	private int num1;
	private int num2;

	public Context(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}