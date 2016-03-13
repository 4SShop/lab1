package abstractEntity;

import DaoImpl.TeaBased;

public class TeaBeverage extends Beverage {
	private String size;
	public TeaBeverage() {
		super.sizeFactor = new TeaBased();
	}

	public String getDescription(){
		return description;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public double cost() {
		return super.cost() + super.sizeFactor.sizeCost(size);
	}
}
