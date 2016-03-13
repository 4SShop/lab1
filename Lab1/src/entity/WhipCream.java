package entity;

import abstractEntity.Beverage;
import abstractEntity.BeverageWithIngredient;

public class WhipCream extends BeverageWithIngredient {
	public WhipCream(Beverage drink) {
		super(drink);
		description += " whip";
	}

	public double cost() {
		return 0.3 + super.cost();
	}
}
