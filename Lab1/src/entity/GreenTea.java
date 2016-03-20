package entity;

import abstractEntity.TeaBeverage;

public class GreenTea extends TeaBeverage {
	
	public GreenTea() {
		description = "Green Tea";
	}
	//÷ÿ–¥cost∑Ω∑®
	public double cost() {
		return super.cost() + 1.0;
	}
}
