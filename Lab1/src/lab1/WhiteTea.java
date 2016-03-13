package lab1;

public class WhiteTea extends TeaBeverage {

	public WhiteTea() {
		description =super.description+ "White Tea";
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
