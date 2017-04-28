package ca.developer.test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

	List<Item> basket = new ArrayList<Item>();

	public double calculateSubTotal() {
		double subtotal = 0;
		for (Item item : basket) {
			subtotal += item.getSubTotal();
		}
		return subtotal;
	}

	public void add(Item item) {
		basket.add(item);
	}

	public double calculateTotalSavings() {
		double savings = 0;
		for (Item item : basket) {
			savings += item.getSaving();
		}
		return savings;

	}

}
