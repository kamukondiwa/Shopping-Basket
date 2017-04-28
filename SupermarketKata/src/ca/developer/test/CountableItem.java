package ca.developer.test;

public class CountableItem extends Item {

	private int count;

	public CountableItem(String name, double price, int count) {
		super(name, price);
		this.count = count;
	}

	public double getSubTotal() {
		return getPrice() * count;
	}

}
