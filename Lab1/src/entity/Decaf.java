package entity;

import abstractEntity.CoffeeBeverage;

public class Decaf extends CoffeeBeverage {//new coffee Decaf
	private String description;

	public Decaf() {
		description =super.description+ "Decaf";
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
