package com.java.builder;

public class ManBuilder implements PersonBuilder {
	private Person person;

	ManBuilder() {
		person = new Man();
	}

	@Override
	public void buildHead() {
		person.setHead("Build man's head");
	}

	@Override
	public void buildBody() {
		person.setBody("Build man's body");
	}

	@Override
	public void buildFoot() {
		person.setFoot("Build man's foot");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
