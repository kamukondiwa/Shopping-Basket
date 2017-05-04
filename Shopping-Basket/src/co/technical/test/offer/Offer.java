package co.technical.test.offer;

import java.util.Map;

import co.technical.test.Good;
import co.technical.test.price.OfferPrice;

public interface Offer {
	public OfferPrice getOffer(Map<Good, Integer> goods);

	public boolean isMatch(Map<Good, Integer> goods);

	public String getName();

}
