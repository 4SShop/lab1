package abstractEntity;

import Dao.SizeFactor;

public class Beverage {
	protected SizeFactor sizeFactor;//composition
    protected String description="";
	public double cost() {//no cost with empty cup
		return 0;
	}
	//Beverage���е�getDescription������������if/else�����жϵĴ���
	public String getDescription(){
		return description;
	}
}
