package ca.developer.test;

public class Item {

	private String name;
	private double price;
	private int count;
	
	public Item (String name, double price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public double getSubTotal() {
		return price * count;
	}

}
