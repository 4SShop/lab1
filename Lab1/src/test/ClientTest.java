package test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

import factory.Client;
import junit.framework.Assert;

public class ClientTest {
	Client client;
	@Before
	public void setUp() throws Exception {
		client = new Client();
			}

	@Test
	public void testGetBeverage() {
		String[] disArr= { "Mocha", "large", "milk", "milk"};
		client.setDisArr(disArr);
		DecimalFormat df = new DecimalFormat(".0");
		Assert.assertEquals(2.9, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		disArr[0] = "White Tea";
		client.setDisArr(disArr);
		Assert.assertEquals(2.3, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		disArr[1] = "small";
		client.setDisArr(disArr);
		Assert.assertEquals(1.8, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		disArr[2] = "WhipCream";
		client.setDisArr(disArr);
		Assert.assertEquals(1.8, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		disArr[3] = "chocolate";
		client.setDisArr(disArr);
		Assert.assertEquals(1.8, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		String[] arg2 = {"Mocha","large"};
		client.setDisArr(arg2);
		Assert.assertEquals(2.3, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		String[] arg3 = {"Latte","large"};
		client.setDisArr(arg3);
		Assert.assertEquals(2.3, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		String[] arg4 = {"Decaf","Mocha","large"};
		client.setDisArr(arg4);
		Assert.assertEquals(1.8, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		String[] arg5 = {"Decaf","Cappuccino","large"};
		client.setDisArr(arg5);
		Assert.assertEquals(1.8, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		String[] arg6 = {"Flower","Tea","large"};
		client.setDisArr(arg6);
		Assert.assertEquals(2.2, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		String[] arg7 = {"Ginger","Tea","large"};
		client.setDisArr(arg7);
		Assert.assertEquals(2.3, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		String[] arg8 = {"HouseBlend","large"};
		client.setDisArr(arg8);
		Assert.assertEquals(1.8, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		String[] arg9 = {"Tea","Latte","large"};
		client.setDisArr(arg9);
		Assert.assertEquals(1.8, Double.parseDouble(df.format(client.getBeverage().cost())),0);
		
	}

	

}
