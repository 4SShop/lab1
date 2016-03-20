package entity;

import abstractEntity.Beverage;
import abstractEntity.BeverageWithIngredient;

public class Jasmine extends BeverageWithIngredient {
	public Jasmine(Beverage drink) {
		super(drink);
		description += " jasmine";
	}
	//ÖØĞ´cost·½·¨
	public double cost() {
		return 0.5 + super.cost();
	}
}
