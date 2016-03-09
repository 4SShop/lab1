package lab1;

public class HouseBlend extends CoffeeBeverage {
	private String description;
	
	public HouseBlend() {
		description =super.description+ "HouseBlend";
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 0.8;
	}
}
