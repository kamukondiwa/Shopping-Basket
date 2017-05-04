package co.technical.test.offer;

import java.time.ZonedDateTime;
import java.time.temporal.IsoFields;
import java.util.Map;

import co.technical.test.AvailableGoods;
import co.technical.test.Good;
import co.technical.test.price.OfferPrice;

public class Apple10 implements Offer {

	@Override
	public OfferPrice getOffer(Map<Good, Integer> goods) {
		OfferPrice offerPrice = new OfferPrice(0);
		if (goods.containsKey(AvailableGoods.APPLES)) {
			int appleCount = goods.get(AvailableGoods.APPLES);
			offerPrice.plus(AvailableGoods.APPLES.getPrice(), appleCount);
			offerPrice.getTenPercent();
		}
		return offerPrice;
	}

	@Override
	public boolean isMatch(Map<Good, Integer> goods) {
		return goods.containsKey(AvailableGoods.APPLES) && goods.get(AvailableGoods.APPLES) > 0 && thisWeek();
	}

	private boolean thisWeek() {
		ZonedDateTime now = ZonedDateTime.now();
		return now.getYear() == 2017 && now.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR) == 18;
	}

	@Override
	public String getName() {
		return "Apples 10% off";
	}

}
