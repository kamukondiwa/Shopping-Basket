package co.technical.test;

public class Price {

	private double price;

	public Price(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void plus(Price other, Integer count) {
		price += other.getPrice() * count;
	}

	@Override
	public boolean equals(Object other) {
		if (other == null || !(other instanceof Price))
			return false;

		Price otherPrice = (Price) other;
		return price == otherPrice.getPrice();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
