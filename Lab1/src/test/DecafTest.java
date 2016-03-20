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
		Assert.assertEquals(1.4,df.cost(),0);
		df.setSize("medium");
		Assert.assertEquals(1.7,df.cost(),0);
		df.setSize("large");
		Assert.assertEquals(2.0,df.cost(),0);
		df.setSize("grant");
		Assert.assertEquals(2.3,df.cost(),0);
	}

}
