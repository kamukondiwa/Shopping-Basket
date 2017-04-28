package ca.developer.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingRules {
	public double buy3get1Free(CountableItem item) {
		return item.getCount() / 3 * item.getPrice();
	}

	public double buy2for1(CountableItem item) {
		return new BigDecimal(item.getCount() / 2 * ((2 * item.getPrice()) - 1)).setScale(1, RoundingMode.HALF_UP)
				.doubleValue();
	}

	public enum SAVING_RULES {
		BUY3GET1FREE, BUY2FOR1, NORULE
	}

}
