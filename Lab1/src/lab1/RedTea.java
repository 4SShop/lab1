package lab1;

public class RedTea extends TeaBeverage {
	private String description;
	
	public RedTea() {
		description =super.description+ "Red Tea";
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 0.8;
	}
}
