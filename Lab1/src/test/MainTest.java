package test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import factory.Client;
import junit.framework.Assert;
import lab1.Main;

public class MainTest {
	
	Main main;
	@Before
	public void setUp() throws Exception {
		main = new Main();
	}
	@Test
	public void testMain() {
		DecimalFormat df = new DecimalFormat(".0");
		//String[] args = {"2", "Mocha", "small", "milk", "milk", ";","White", "Tea", "large", "Ginger",";","Decaf", "Cappuccino","large"};
		String[] args = { "Mocha", "small"};
		Assert.assertEquals(1.7,Double.parseDouble(df.format((main.calculate(main.splitArgs(args),new Client()))[0])),0 );
		String[] args2 = {"3", "Decaf","Cappuccino", "small", "milk", "milk", ";","Tea", "Latte", "large", "Ginger"};
		Assert.assertEquals(7.8,Double.parseDouble(df.format((main.calculate(main.splitArgs(args2),new Client()))[0])),0 );
		String[] args3 = {"2", "Flower","Tea", "small", "milk", ";","Green", "Tea", "small", "Ginger"};
		Assert.assertEquals(5.8,Double.parseDouble(df.format((main.calculate(main.splitArgs(args3),new Client()))[0])),0 );
		String[] args4 = { "Red","Tea", "medium", "chocolate", "milk", ";","Ginger", "Tea", "grant","milk"};
		Assert.assertEquals(4.7,Double.parseDouble(df.format((main.calculate(main.splitArgs(args4),new Client()))[0])),0 );
		
	}
	@Test
	public void testSplitArgs() {
		//test the splitArgs method
		String[] args = {"3", "Mocha", "small", "milk", "milk", ";","White", "Tea", "large", "Ginger"};
		ArrayList<String[]> list = main.splitArgs(args);
		ArrayList<String[]> actualList = new ArrayList();
		//System.out.println(list.size()+list.get(0)[0]);
		
		String[] a =  {"Mocha", "small", "milk", "milk"};
		String[] b = {"White", "Tea", "large", "Ginger"};
		actualList.add(a);
		actualList.add(a);
		actualList.add(a);
		actualList.add(b);
		
		Assert.assertEquals(true, isListEqual(list,actualList));
		
	}
	public static boolean isListEqual(ArrayList<String[]> a , ArrayList<String[]> b ){
		if(a.size() != b.size())
			return false;
		else{
			for(int i = 0 ; i < a.size() ; i++){
				if((a.get(i) != null && b.get(i) != null &&a.get(i).length != b.get(i).length)||(a.get(i) == null && a.get(i)!= b.get(i)))
					return false;
				for(int j = 0 ; j <  a.get(i).length; j++){
					if((a.get(i)[j]!= null && a.get(i)[j].equals(b.get(i)[j]))||a.get(i)[j] == b.get(i)[j]){
						
					}else{
						return false;
					}
				}
			}
			return true;
		}
		
	}

}
