package lab1;

public class CoffeeBeverage extends Beverage {
	private String size;
    protected String description="";
	public CoffeeBeverage() {
		super.sizeFactor = new CoffeeBased();
		this.description=super.description+" "+size;//write the size into description
	}

	public void setSize(String size) {
		this.size = size;
	}
    public String getDescription(){
    	return description;
    }
	public double cost() {
		return super.cost() + super.sizeFactor.sizeCost(size);
	}
}
