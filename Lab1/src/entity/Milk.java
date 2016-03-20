package entity;

import abstractEntity.Beverage;
import abstractEntity.BeverageWithIngredient;

public class Milk extends BeverageWithIngredient {
	public Milk(Beverage drink) {
		super(drink);
		description += " milk";
	}
	//÷ÿ–¥cost∑Ω∑®
	public double cost() {
		return 0.3 + super.cost();
	}
}
