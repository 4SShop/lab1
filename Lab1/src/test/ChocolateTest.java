package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import abstractEntity.Beverage;
import entity.Chocolate;
import junit.framework.Assert;

public class ChocolateTest {
	Chocolate ch;
	@Before
	public void setUp() throws Exception {
		ch = new Chocolate(new Beverage());
		
	}

	@Test
	public void testCost() {
		Assert.assertEquals(0.3, ch.cost(),0);
	}
	@Test
	public void testGetDesciption(){
		Assert.assertTrue(" chocolate".equals(ch.getDescription()));
	}

}
