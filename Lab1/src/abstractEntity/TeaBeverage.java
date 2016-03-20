package abstractEntity;

import DaoImpl.TeaBased;

public class TeaBeverage extends Beverage {
	private String size;
	public TeaBeverage() {
		super.sizeFactor = new TeaBased();
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
