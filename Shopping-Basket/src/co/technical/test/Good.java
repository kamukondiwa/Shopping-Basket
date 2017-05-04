package co.technical.test;

import co.technical.test.price.Price;

public class Good {
	private String name;
	private Price price;

	public Good(String name, int price) {
		this.name = name;
		this.price = new Price(price);
	}

	public String getName() {
		return name;
	}

	public Price getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object other) {
		if (other == null || !(other instanceof Good))
			return false;

		Good good = (Good) other;
		return name.equals(good.getName()) && price.equals(good.getPrice());
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
