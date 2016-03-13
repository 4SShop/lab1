package abstractEntity;

import daoImpl.CoffeeBased;

public class CoffeeBeverage extends Beverage {
	private String size;
	public CoffeeBeverage() {
		super.sizeFactor = new CoffeeBased();
	}

	public void setSize(String size) {
		this.size = size;
		description+=" "+size;
	}
    public String getDescription(){
    	return description;
    }
	public double cost() {
		return super.cost() + super.sizeFactor.sizeCost(size);
	}
}
