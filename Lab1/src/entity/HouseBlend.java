package entity;

import abstractEntity.CoffeeBeverage;

public class HouseBlend extends CoffeeBeverage {
	
	public HouseBlend() {
		description =super.description+ "HouseBlend";
	}

	public double cost() {
		return super.cost() + 0.8;
	}
}
