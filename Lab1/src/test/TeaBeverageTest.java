package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import abstractEntity.TeaBeverage;
import junit.framework.Assert;

public class TeaBeverageTest {
	TeaBeverage tb;
	@Before
	public void setUp() throws Exception {
		tb = new TeaBeverage();
	}

	@Test
	public void testCost() {
		tb.setSize("small");
		Assert.assertEquals(0.2,tb.cost(),0);
		tb.setSize("medium");
		Assert.assertEquals(0.5,tb.cost(),0);
		tb.setSize("large");
		Assert.assertEquals(0.7,tb.cost(),0);
		tb.setSize("grant");
		Assert.assertEquals(0.9,tb.cost(),0);
	}

}
