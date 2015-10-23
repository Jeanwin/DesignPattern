package com.java.factory_method;

public class Test {
	public static void main(String[] args) {
		IWorkFactory wf1 = new StudentWorkFactory();
		wf1.getWork().doWork();

		IWorkFactory wf2 = new TeacherWorkFactory();
		wf2.getWork().doWork();
	}

}
