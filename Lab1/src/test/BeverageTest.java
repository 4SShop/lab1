/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import abstractEntity.Beverage;
import entity.Espresso;
import junit.framework.Assert;

/**
 * @author linhangyu19960303
 *
 */
public class BeverageTest {
	Beverage bg;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bg = new Beverage();
	}

	/**
	 * Test method for {@link abstractEntity.Beverage#cost()}.
	 */
	@Test
	public void testCost() {
		Assert.assertEquals(0.0, bg.cost(),0);
	}

	

}
