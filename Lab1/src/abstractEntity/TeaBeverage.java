package abstractEntity;

import DaoImpl.TeaBased;

public class TeaBeverage extends Beverage {
	private String size;
	protected String description="";
	public TeaBeverage() {
		super.sizeFactor = new TeaBased();
		this.description=super.description+" "+size;//write the size into description
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
