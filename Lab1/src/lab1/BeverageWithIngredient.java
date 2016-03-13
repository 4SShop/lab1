package lab1;

public class BeverageWithIngredient extends Beverage {
	private Beverage drink;	//composition


	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
	}
	
	public double cost() {
		return drink.cost();
	}
}
