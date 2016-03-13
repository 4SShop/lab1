package lab1;
/*
 * We provide a BeverageFactory interface and FactoryCoffee, BeverageTea which implement the interface
 * Through the Client, one of two class will be initiated and the beverage can be produced by accordingly factory
 */

public interface BeverageFactory {
	//create the ingredient of the beverage
	abstract BeverageWithIngredient createIngredient(String[] type);
	//create the beverage
	abstract Beverage createBeverage(String size);
	abstract void create();
}
abstract class FactoryCoffee implements BeverageFactory {
	private Beverage beverage;
	protected CoffeeBeverage coffee;

	@Override
	public BeverageWithIngredient createIngredient(String[] type) {
		// TODO 自动生成的方法存根
		
		BeverageWithIngredient re = null;
		//Add ingredient by input
		for(int i=0; i<type.length; i++) {
			if(type[i].equals("ginger"))
				re = new Ginger(beverage);
			else if(type[i].equals("milk"))
				re = new Milk(beverage);
			else if(type[i].equals("jasmine"))
				re = new Jasmine(beverage);
			else if(type[i].equals("whipcream"))
				re = new WhipCream(beverage);
			else if(type[i].equals("chocolate"))
				re = new Chocolate(beverage);
			else
				re = null;
		}
		return re;
	}

	@Override
	public Beverage createBeverage(String size) {
		// TODO 自动生成的方法存根
		coffee.setSize(size);
		beverage = coffee;
		return beverage;
	}


	public void setCoffee(CoffeeBeverage coffee) {
		this.coffee = coffee;
	}

}
abstract class FactoryTea implements BeverageFactory {
	private Beverage beverage;
	protected TeaBeverage tea;
	@Override
	public BeverageWithIngredient createIngredient(String[] type) {
		// TODO 自动生成的方法存根
		//Add ingredient by input
		BeverageWithIngredient re = null;
		for(int i=0; i<type.length; i++) {
			if(type[i].equals("ginger"))
				re = new Ginger(beverage);
			else if(type[i].equals("milk"))
				re = new Milk(beverage);
			else if(type[i].equals("jasmine"))
				re = new Jasmine(beverage);
			else if(type[i].equals("whipcream"))
				re = new WhipCream(beverage);
			else if(type[i].equals("chocolate"))
				re = new Chocolate(beverage);
			else
				re = null;
		}
		return re;
	}

	@Override
	public Beverage createBeverage(String size) {
		// TODO 自动生成的方法存根
		tea.setSize(size);
		beverage = tea;
		return beverage;
	}

	public void setTea(TeaBeverage tea) {
		this.tea = tea;
	}

}
//substantial factory class
class FactoryHouseBlend extends FactoryCoffee {
	public void create() {
		setCoffee(new HouseBlend());
	}
}
class FactoryEspresso extends FactoryCoffee {
	public void create() {
		setCoffee(new Espresso());
	}
}
class FactoryDecaf extends FactoryCoffee {
	public void create() {
		setCoffee(new Decaf());
	}
}
class FactoryGreenTea extends FactoryTea {
	public void create() {
		setTea(new GreenTea());
	}
}
class FactoryRedTea extends FactoryTea {
	public void create() {
		setTea(new RedTea());
	}
}class FactoryWhiteTea extends FactoryTea {
	public void create() {
		setTea(new WhiteTea());
	}
}