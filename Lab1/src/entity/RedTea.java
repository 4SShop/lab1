package entity;

import abstractEntity.TeaBeverage;

public class RedTea extends TeaBeverage {
	
	public RedTea() {
		description =super.description+ "Red Tea";
	}
	//��дcost����
	public double cost() {
		return super.cost() + 0.8;
	}
}
