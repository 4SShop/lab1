package entity;

import abstractEntity.TeaBeverage;

public class GreenTea extends TeaBeverage {
	private String description;
	
	public GreenTea() {
		description = "Green Tea";
	}
	
	public String getDiscription() {
		return description;
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
