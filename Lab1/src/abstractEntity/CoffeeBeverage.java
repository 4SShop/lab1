package abstractEntity;

import DaoImpl.CoffeeBased;

public class CoffeeBeverage extends Beverage {
	private String size;
	public CoffeeBeverage() {
		super.sizeFactor = new CoffeeBased();
	}
	//设定size
	public void setSize(String size) {
		this.size = size;
	}
	//重写cost方法，最终获取的cost将是一层层向上累计后获得的结果
	public double cost() {
		return super.cost() + super.sizeFactor.sizeCost(size);
	}
}
