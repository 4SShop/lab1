package entity;

import abstractEntity.TeaBeverage;

public class WhiteTea extends TeaBeverage {

	public WhiteTea() {
		description =super.description+ "White Tea";
	}
	//��дcost����
	public double cost() {
		return super.cost() + 1.0;
	}
}
