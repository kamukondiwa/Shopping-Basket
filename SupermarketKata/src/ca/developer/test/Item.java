package ca.developer.test;

public abstract class Item {

	private String name;
	private double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public abstract double getSubTotal();

	public double getPrice() {
		return price;
	}
}
