package co.technical.test.offer;

import java.util.Map;

import co.technical.test.AvailableGoods;
import co.technical.test.Good;
import co.technical.test.price.OfferPrice;

public class BuyTwoSoupBread50 implements Offer {

	@Override
	public OfferPrice getOffer(Map<Good, Integer> goods) {
		if (goods.containsKey(AvailableGoods.SOUP) && goods.containsKey(AvailableGoods.BREAD)) {
			int breadMax = goods.get(AvailableGoods.SOUP) / 2;
			int breadCount = goods.get(AvailableGoods.BREAD);
			OfferPrice offer = new OfferPrice(0);
			offer.plus(AvailableGoods.BREAD.getPrice(), (Integer) Math.min(breadMax, breadCount));
			offer.getFiftyPercent();
			return offer;
		} else
			return new OfferPrice(0);
	}

	@Override
	public boolean isMatch(Map<Good, Integer> goods) {
		return goods.containsKey(AvailableGoods.SOUP) && goods.get(AvailableGoods.SOUP) >= 2
				&& goods.containsKey(AvailableGoods.BREAD) && goods.get(AvailableGoods.BREAD) >= 1;
	}

	@Override
	public String getName() {
		return "Bread 50% off";
	}

}
