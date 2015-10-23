package com.java.factory_method;

/**
 * 产品实现类
 * 
 * @author admin
 * 
 */
public class StudentWork implements Work {

	@Override
	public void doWork() {
		System.out.println("Students do homework");
	}

}
