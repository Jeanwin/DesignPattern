package com.java.factory_abstract;

public class WhiteAnimalFactory implements IAnimalFactory {

	@Override
	public ICat getCat() {
		return new WhiteCat();
	}

	@Override
	public IDog getDog() {
		return new WhiteDog();
	}

}
