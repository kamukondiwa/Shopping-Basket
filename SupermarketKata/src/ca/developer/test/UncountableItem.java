package ca.developer.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UncountableItem extends Item {

	private double amount;

	public UncountableItem(String name, double price, double amount) {
		super(name, price);
		this.amount = amount;
	}

	@Override
	public double getSubTotal() {
		return new BigDecimal(amount * getPrice()).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

}
