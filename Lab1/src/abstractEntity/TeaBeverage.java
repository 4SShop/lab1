package abstractEntity;

import DaoImpl.TeaBased;

public class TeaBeverage extends Beverage {
	private String size;
	public TeaBeverage() {
		super.sizeFactor = new TeaBased();
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
