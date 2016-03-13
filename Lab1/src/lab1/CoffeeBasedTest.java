package lab1;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoffeeBasedTest {
	CoffeeBased cb;

	@Before
	public void setUp() throws Exception {
		cb = new CoffeeBased();
	}

	@Test(timeout = 1000)
	public void testSizeCost() {
		Beverage order=new Decaf();
		System.out.println(order.getDescription());
		((CoffeeBeverage)order).setSize("small");
		System.out.println(order.getDescription());
		order=new Jasmine(order);
		System.out.println(order.getDescription());
		Assert.assertEquals(0.4, cb.sizeCost("small"), 0);
		Assert.assertEquals(0.7, cb.sizeCost("medium"), 0);
		Assert.assertEquals(1.0, cb.sizeCost("large"), 0);
	}

}
