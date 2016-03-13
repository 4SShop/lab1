package lab1;

public class Espresso extends CoffeeBeverage {
	
	public Espresso() {
		description =super.description+ "Esspresso";
	}


	public double cost() {
		return super.cost() + 1.0;
	}
}
