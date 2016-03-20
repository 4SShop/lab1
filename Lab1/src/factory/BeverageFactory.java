package factory;

import abstractEntity.Beverage;
import abstractEntity.BeverageWithIngredient;
import abstractEntity.CoffeeBeverage;
import abstractEntity.TeaBeverage;
import entity.Chocolate;
import entity.Decaf;
import entity.Espresso;
import entity.Ginger;
import entity.GreenTea;
import entity.HouseBlend;
import entity.Jasmine;
/*
 * We provide a BeverageFactory interface and FactoryCoffee, BeverageTea which implement the interface
 * Through the Client, one of two class will be initiated and the beverage can be produced by accordingly factory
 */
import entity.Milk;
import entity.RedTea;
import entity.WhipCream;
import entity.WhiteTea;

public interface BeverageFactory {
	//create the ingredient of the beverage
	abstract BeverageWithIngredient createIngredient(String[] type);
	//create the beverage
	abstract Beverage createBeverage(String size);
	abstract void create();
	
	
	
}
class Factory {
	public BeverageWithIngredient addMilk(Beverage beverage) {
		return new Milk(beverage);
	}
	public BeverageWithIngredient addChocolate(Beverage beverage) {
		return new Chocolate(beverage);
	}
	public BeverageWithIngredient addGinger(Beverage beverage) {
		return new Ginger(beverage);
	}
	public BeverageWithIngredient addJasmine(Beverage beverage) {
		return new Jasmine(beverage);
	}
	public BeverageWithIngredient addWhipCream(Beverage beverage) {
		return new WhipCream(beverage);
	}
}
abstract class FactoryCoffee extends Factory implements BeverageFactory {
	private Beverage beverage;
	protected CoffeeBeverage coffee;

	@Override
	public BeverageWithIngredient createIngredient(String[] type) {
		// TODO 自动生成的方法存根
		BeverageWithIngredient re = null;
		//Add ingredient by input
		if(type != null) {
			for(int i=0; i<type.length; i++) {
				if(type[i].equals("ginger"))
					re = addGinger(beverage);
				else if(type[i].equals("milk"))
					re = addMilk(beverage);
				else if(type[i].equals("jasmine"))
					re = addJasmine(beverage);
				else if(type[i].equals("whipcream"))
					re = addWhipCream(beverage);
				else if(type[i].equals("chocolate"))
					re = addChocolate(beverage);
				else {
					System.out.println("Wrong input!");
					System.exit(0);
				}

				beverage = re;
			}
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
abstract class FactoryTea extends Factory implements BeverageFactory {
	private Beverage beverage;
	protected TeaBeverage tea;
	@Override
	public BeverageWithIngredient createIngredient(String[] type) {
		// TODO 自动生成的方法存根
		//Add ingredient by input
		BeverageWithIngredient re = null;
		if(type != null) {
			for(int i=0; i<type.length; i++) {
				if(type[i].equals("ginger"))
					re = addGinger(beverage);
				else if(type[i].equals("milk"))
					re = addMilk(beverage);
				else if(type[i].equals("jasmine"))
					re = addJasmine(beverage);
				else {
					System.out.println("Wrong input!");
					System.exit(0);
				}
				beverage = re;
			}
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