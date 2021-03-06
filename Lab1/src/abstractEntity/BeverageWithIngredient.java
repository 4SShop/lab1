package abstractEntity;


public class BeverageWithIngredient extends Beverage {
	private Beverage drink;	//composition

	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
		description=drink.description;
	}
	
	public double cost() {
		return drink.cost();
	}
}
