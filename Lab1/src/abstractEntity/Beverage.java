package abstractEntity;

import Dao.SizeFactor;

public class Beverage {
	protected SizeFactor sizeFactor;//composition
    protected String description="";
	public double cost() {//no cost with empty cup
		return 0;
	}
	//Beverage类中的getDescription方法，减少用if/else进行判断的次数
	public String getDescription(){
		return description;
	}
}
