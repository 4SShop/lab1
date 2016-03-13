package lab1;

public class Chocolate extends BeverageWithIngredient {
	public Chocolate(Beverage drink) {
		super(drink);
		description += " chocolate";
	}
	public double cost() {
		return 0.3 + super.cost();
	}
}
