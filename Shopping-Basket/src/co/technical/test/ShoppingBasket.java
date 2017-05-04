package co.technical.test;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

	private Map<Good, Integer> basket = new HashMap<Good, Integer>();

	public Price getSubtotal() {
		Price subTotal = new Price(0);
		getBasket().forEach((good, count) -> subTotal.plus(good.getPrice(), count));
		return subTotal;
	}

	public void addGood(Good good) {
		int count = 1;
		if (basket.containsKey(good))
			count += getBasket().get(good);
		basket.put(good, count);		
	}

	public Map<Good, Integer> getBasket() {
		return basket;
	}

}
