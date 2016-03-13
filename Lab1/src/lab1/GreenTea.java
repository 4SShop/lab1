package lab1;

public class GreenTea extends TeaBeverage {

	
	public GreenTea() {
		description = "Green Tea";
	}
	

	public double cost() {
		return super.cost() + 1.0;
	}
}
