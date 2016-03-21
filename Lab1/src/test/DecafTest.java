package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import abstractEntity.Beverage;
import entity.Decaf;
import junit.framework.Assert;

public class DecafTest {
	Decaf df ;
	@Before
	public void setUp() throws Exception {
		df = new Decaf();
	}

	@Test
	public void testCost() {
		df.setSize("small");
		Assert.assertEquals(0.9,df.cost(),0);
		df.setSize("medium");
		Assert.assertEquals(1.2,df.cost(),0);
		df.setSize("large");
		Assert.assertEquals(1.5,df.cost(),0);
		df.setSize("grant");
		Assert.assertEquals(1.8,df.cost(),0);
	}

}
