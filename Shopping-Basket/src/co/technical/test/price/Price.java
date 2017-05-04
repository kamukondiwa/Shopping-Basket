package co.technical.test.price;

import java.text.NumberFormat;
import java.util.Locale;

public class Price {

	private int price;

	public Price(int price) {
		this.setPrice(price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void plus(Price other, Integer count) {
		setPrice(getPrice() + other.getPrice() * count);
	}

	@Override
	public boolean equals(Object other) {
		if (other == null || !(other instanceof Price))
			return false;

		Price otherPrice = (Price) other;
		return getPrice() == otherPrice.getPrice();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public Price minus(Price other) {
		return new Price(getPrice() - other.getPrice());
	}

	@Override
	public String toString() {
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.UK);

		return currencyFormatter.format(getPrice()/100.0);
	}

}
