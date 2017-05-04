package co.technical.test;

import java.util.HashMap;
import java.util.Map;

public class AvailableGoods {
	public static final Good MILK = new Good("Milk", 130);

	public static final Good BREAD = new Good("Bread", 80);

	public static final Good SOUP = new Good("Soup", 65);

	public static final Good APPLES = new Good("Apples", 100);

	private static Map<String, Good> availableGoods = new HashMap<String, Good>();

	public AvailableGoods() {
		getAvailableGoods().put("Soup", SOUP);
		getAvailableGoods().put("Bread", BREAD);
		getAvailableGoods().put("Milk", MILK);
		getAvailableGoods().put("Apples", APPLES);
	}

	public Map<String, Good> getAvailableGoods() {
		return availableGoods;
	}
	
}
