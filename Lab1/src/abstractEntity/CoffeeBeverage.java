package abstractEntity;

import DaoImpl.CoffeeBased;

public class CoffeeBeverage extends Beverage {
	private String size;
	public CoffeeBeverage() {
		super.sizeFactor = new CoffeeBased();
	}
	//�趨size
	public void setSize(String size) {
		this.size = size;
	}
	//��дcost���������ջ�ȡ��cost����һ��������ۼƺ��õĽ��
	public double cost() {
		return super.cost() + super.sizeFactor.sizeCost(size);
	}
}
