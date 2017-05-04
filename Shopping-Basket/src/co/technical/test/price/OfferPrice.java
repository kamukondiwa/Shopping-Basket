package co.technical.test.price;

public class OfferPrice extends Price {

	public OfferPrice(int price) {
		super(price);
	}

	public void getTenPercent() {
		setPrice(getPrice() / 10);
	}

	public void getFiftyPercent() {
		setPrice(getPrice() / 2);
	}

	@Override
	public String toString() {
		return "-" + getPrice() + "p";
	}
}
