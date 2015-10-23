package com.java.factory_abstract;

public class BlackAnimalFactory implements IAnimalFactory {

	@Override
	public ICat getCat() {
		return new BlackCat();
	}

	@Override
	public IDog getDog() {
		return new BlackDog();
	}

}
