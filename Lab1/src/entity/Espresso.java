package entity;

import abstractEntity.CoffeeBeverage;

public class Espresso extends CoffeeBeverage {
	
	public Espresso() {
		description =super.description+ "Esspresso";
	}
	//��дcost����
	public double cost() {
		return super.cost() + 1.0;
	}
}
