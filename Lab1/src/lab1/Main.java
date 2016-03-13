package lab1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import abstractEntity.Beverage;
import factory.Client;

public class Main {
	public static void main(String[] args) {
		//String[] disArr = new String[args.length];
		String[] disArr = {"2", "Mocha", "small", "milk", "milk", ";","White", "Tea", "large", "Ginger"};
		Client client = new Client();
		ArrayList<String[]> list = splitArgs(disArr);

		ArrayList<Beverage> order = new ArrayList<Beverage>();
		for(int i = 0; i< list.size(); i++) {
			client.setDisArr(list.get(i));
			order.add(client.getBeverage());
			/**
			 * How do I get the description of each order instead of doing this
			 * stupid thing forever (except for printing the args)?
			 */
			//we move getDescription from a actual drink to Beverage
			order.get(i).getDescription();
			// and so on...

			DecimalFormat df = new DecimalFormat(".0");
			System.out.println("The total cost of your order is: "
					+ df.format(order.get(i).cost()));
		}
	}
	/*
	 * deal with the input string array
	 * split the order into simple order style
	 */
	public static ArrayList<String[]> splitArgs(String[] args) {
		ArrayList<String[]> re = new ArrayList<String[]>();
		ArrayList<Integer> index = new ArrayList<Integer>();
		//deal with multiple ordering
		for(int i = 0; i < args.length; i++) {
			if(args[i].equals(";")) {
				index.add(i);
			}
			if(i == args.length - 1) {
				index.add(i+1);
			}
		}
		//deal with multiple same cups
		int temp = 0;
		for(int i = 0; i<index.size(); i++) {
			boolean number = isNumber(args[temp]);
			int size = (number)?(index.get(i)-temp-1):(index.get(i)-temp);
			String[] arguments = new String[size];

			for(int j = temp; j < index.get(i); j++) {
				if(number) {
					if(j != temp) {
						arguments[j-temp-1] = args[j];
					}
				}
				else {
					arguments[j-temp] = args[j];
				}

			}
			if(number) {
				for(int j = 1; j < Integer.parseInt(args[temp]); j++) {
					re.add(arguments);
				}
			}
			re.add(arguments);
			temp = index.get(i) + 1;
		}
		return re;
	}
	//determining whether the first string is a number
	public static boolean isNumber(String str) {
		Pattern pattern = Pattern.compile("[0-9]*"); 
		Matcher isNum = pattern.matcher(str);
		if( !isNum.matches() ){
			return false; 
		} 
		return true; 
	}
}