package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import abstractEntity.Beverage;
import abstractEntity.BeverageWithIngredient;
import junit.framework.Assert;

public class BeverageWithIngredientTest {
	BeverageWithIngredient bgi;
	@Before
	public void setUp() throws Exception {
		bgi = new BeverageWithIngredient(new Beverage());
	}

	@Test
	public void testCost() {
		Assert.assertEquals(0, bgi.cost(), 0);
	}

}
