package entity;

import abstractEntity.Beverage;
import abstractEntity.BeverageWithIngredient;

public class Ginger extends BeverageWithIngredient {
	public Ginger(Beverage drink) {
		super(drink);
		description += " ginger";
	}
	//÷ÿ–¥cost∑Ω∑®
	public double cost() {
		return 0.6 + super.cost();
	}
}