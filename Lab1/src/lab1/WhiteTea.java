package lab1;

public class WhiteTea extends TeaBeverage {
//	private String description;

	public WhiteTea() {
		description = "White Tea";
	}
	
//	public String getDescription() {
//		return description;
//	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
