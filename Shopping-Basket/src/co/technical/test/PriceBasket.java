package co.technical.test;

import java.util.Map;

import co.technical.test.price.OfferPrice;

public class PriceBasket {

	public static void main(String[] args) {
		AvailableGoods availableGoods = new AvailableGoods();
		ShoppingBasket basket = new ShoppingBasket();
		for (String string : args) {
			if (availableGoods.getAvailableGoods().containsKey(string)) {
				basket.addGood(availableGoods.getAvailableGoods().get(string));
			}
		}

		System.out.println("Subtotal: " + basket.getSubtotal());
		
		Map<String, OfferPrice> offers = basket.getOffers();

		if (offers.isEmpty())
			System.out.println("(No offers available)");
		else
			offers.forEach((name, price) -> System.out.println(name + ": " + price.toString()));

		System.out.println("Total: " + basket.getTotal());

	}

}
