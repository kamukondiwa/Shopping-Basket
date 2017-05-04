package co.technical.test.offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.technical.test.Good;
import co.technical.test.price.OfferPrice;

public class OfferEvaluator {
	List<Offer> availableOffers = new ArrayList<Offer>();

	public OfferEvaluator() {
		availableOffers.add(new Apple10());
		availableOffers.add(new BuyTwoSoupBread50());
	}

	public Map<String, OfferPrice> evaluate(Map<Good, Integer> goods) {
		Map<String, OfferPrice> offers = new HashMap<String, OfferPrice>();
		for (Offer offer : availableOffers) {
			if (offer.isMatch(goods)) {
				offers.put(offer.getName(), offer.getOffer(goods));
			}
		}
		return offers;
	}
}
