package co.technical.test;

import java.util.HashMap;
import java.util.Map;

import co.technical.test.offer.OfferEvaluator;
import co.technical.test.price.OfferPrice;
import co.technical.test.price.Price;

public class ShoppingBasket {

	private Map<Good, Integer> basket = new HashMap<Good, Integer>();
	private Price subTotal = null;
	private Price totalOffers = null;
	private Price total = null;
	private Map<String, OfferPrice> offers = null;

	public void addGood(Good good) {
		int count = 1;
		if (basket.containsKey(good))
			count += getBasket().get(good);
		basket.put(good, count);
	}

	private void calculate() {
		subTotal = new Price(0);
		basket.forEach((good, count) -> subTotal.plus(good.getPrice(), count));
		
		totalOffers = new Price(0);
		OfferEvaluator evaluator = new OfferEvaluator();
		offers = evaluator.evaluate(basket);

		offers.forEach((name, price) -> totalOffers.plus(price, 1));

		total = subTotal.minus(totalOffers);

	}

	public Price getSubtotal() {
		if (subTotal == null)
			calculate();
		return subTotal;
	}

	public Map<Good, Integer> getBasket() {
		return basket;
	}

	public Map<String, OfferPrice> getOffers() {
		if (offers == null)
			calculate();
		return offers;
	}

	public Price getTotal() {
		if (total == null)
			calculate();
		return total;
	}
}
