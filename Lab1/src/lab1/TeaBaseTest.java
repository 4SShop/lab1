package lab1;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TeaBaseTest {
	
		TeaBased tb;

		@Before
		public void setUp() throws Exception {
			tb = new TeaBased();
		}

		@Test(timeout = 1000)
		public void testSizeCost() {
			Assert.assertEquals(0.2, tb.sizeCost("small"), 0);
			Assert.assertEquals(0.5, tb.sizeCost("medium"), 0);
			Assert.assertEquals(0.7, tb.sizeCost("large"), 0);
			Assert.assertEquals(0.9, tb.sizeCost("grant"), 0);
		}

	

}
