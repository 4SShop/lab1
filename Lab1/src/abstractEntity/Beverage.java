package abstractEntity;

import dao.SizeFactor;

public class Beverage {
	protected SizeFactor sizeFactor;//composition
    protected String description="";
	public double cost() {//no cost with empty cup
		return 0;
	}
	public String getDescription(){
		return description;
	}
}