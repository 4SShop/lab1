package entity;

import abstractEntity.CoffeeBeverage;

public class Decaf extends CoffeeBeverage {//new coffee Decaf

	public Decaf() {
		description =super.description+ "Decaf";
	}
	//��дcost����
	public double cost() {
		return super.cost() + 0.5;
	}
}
