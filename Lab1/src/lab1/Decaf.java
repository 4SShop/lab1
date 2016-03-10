package lab1;

public class Decaf extends CoffeeBeverage {//new coffee Decaf
	//private String description;

	public Decaf() {
		super.description = "Decaf";
	}

//	public String getDescription() {
//		return description;
//	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
