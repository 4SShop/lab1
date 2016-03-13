package entity;

import abstractEntity.Beverage;
import abstractEntity.BeverageWithIngredient;

public class Jasmine extends BeverageWithIngredient {
	public Jasmine(Beverage drink) {
		super(drink);
		description += " jasmine";
	}

	public double cost() {
		return 0.5 + super.cost();
	}
}
