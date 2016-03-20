package factory;

import abstractEntity.Beverage;

/*Client class
 *This class is instantiated by Main 
 *This class is used to be the client of the factory pattern
 *Functions:
 *1.Deal with the input commands
 *2.Use the interface to create the beverage ordered
 *3.Connect to the Factory    
 */
public class Client {
	//factory determined by input 
	private BeverageFactory factory;
	private Factory abstractFactory = new Factory();
	//ordered beverage
	private Beverage beverage;
	//input commands
	private String[] disArr;
	
	public Client() {
		
	}

	/**
	 * @return beverage
	 */
	public Beverage getBeverage() {
		beverage = new Beverage();
		//copy with the array of the input
		for (int j = 0; j < disArr.length; j++) {
			disArr[j] = disArr[j].toLowerCase();
		}
		int i;
		for (i = 0; i < disArr.length; i++)
			if (disArr[i].equals("small") || disArr[i].equals("medium")
					|| disArr[i].equals("large") || disArr[i].equals("grant"))
				break;

		if (i >= disArr.length) {
			System.out.println("Must set a size!");
			System.exit(0);
		}

		String beveStr;
		if (i == 2) {
			beveStr = disArr[0] + " " + disArr[1];
		} 
		else {
			beveStr = disArr[0];
		}
		String[] ingre = (disArr.length-i-1 == 0)?null:new String[disArr.length-i-1];
		int j = 0;
		int index = i;
		for(i++; i < disArr.length; i++) {
			ingre[j] = disArr[i];
			j++;
		}
		//initiate the factory
		if (beveStr.equals("espresso")) {
			createBeverage(new FactoryEspresso(), disArr[index], ingre);
		} 
		else if (beveStr.equals("houseblend")) {
			createBeverage(new FactoryHouseBlend(), disArr[index], ingre);
		} 
		else if (beveStr.equals("mocha")) {
			createBeverage(new FactoryEspresso(), disArr[index], ingre);
			beverage = abstractFactory.addChocolate(beverage);
		} 
		else if (beveStr.equals("latte")) {
			createBeverage(new FactoryEspresso(), disArr[index], ingre);
			beverage = abstractFactory.addMilk(beverage);
		} 
		else if (beveStr.equals("cappuccino")) {
			createBeverage(new FactoryEspresso(), disArr[index], ingre);
			beverage = abstractFactory.addWhipCream(beverage);
		} 
		else if(beveStr.equals("decaf mocha")) {
			createBeverage(new FactoryDecaf(), disArr[index], ingre);
			beverage = abstractFactory.addChocolate(beverage);
		}
		else if(beveStr.equals("decaf latte")) {
			createBeverage(new FactoryDecaf(), disArr[index], ingre);
			beverage = abstractFactory.addMilk(beverage);
		}
		else if(beveStr.equals("decaf cappuccino")) {
			createBeverage(new FactoryDecaf(), disArr[index], ingre);
			beverage = abstractFactory.addWhipCream(beverage);
		}
		else if (beveStr.equals("green tea")) {
			createBeverage(new FactoryGreenTea(), disArr[index], ingre);
		} 
		else if (beveStr.equals("red tea")) {
			createBeverage(new FactoryRedTea(), disArr[index], ingre);
		} 
		else if (beveStr.equals("white tea")) {
			createBeverage(new FactoryWhiteTea(), disArr[index], ingre);
		} 
		else if (beveStr.equals("flower tea")) {
			createBeverage(new FactoryGreenTea(), disArr[index], ingre);
			beverage = abstractFactory.addJasmine(beverage);
		} 
		else if (beveStr.equals("ginger tea")) {
			createBeverage(new FactoryGreenTea(), disArr[index], ingre);
			beverage = abstractFactory.addGinger(beverage);
		} 
		else if (beveStr.equals("tea latte")) {
			createBeverage(new FactoryRedTea(), disArr[index], ingre);
			beverage = abstractFactory.addMilk(beverage);
		} 
		else {
			System.out.println("Illegal input: " + beveStr);
			
		}
		return beverage;
	}

	/**
	 * @param beverage 要设置的 beverage
	 */
	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}

	/**
	 * @return factory
	 */
	public BeverageFactory getFactory() {
		return factory;
	}

	/**
	 * @param factory 要设置的 factory
	 */
	public void setFactory(BeverageFactory factory) {
		this.factory = factory;
	}

	/**
	 * @return disArr
	 */
	public String[] getDisArr() {
		return disArr;
	}

	/**
	 * @param disArr 要设置的 disArr
	 */
	public void setDisArr(String[] disArr) {
		this.disArr = disArr;
	}
	
	//substantiate the creating function
	private void createBeverage(BeverageFactory fac, String size, String[] in) {
		setFactory(fac);
		factory.create();
		beverage = factory.createBeverage(size);
		Beverage temp = factory.createIngredient(in);
		if(temp != null) {
			beverage = temp;	
		}
	}
}
