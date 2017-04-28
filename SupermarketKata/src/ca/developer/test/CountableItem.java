package ca.developer.test;

import ca.developer.test.SavingRules.SAVING_RULES;

public class CountableItem extends Item {

	private int count;
	private SAVING_RULES rule = SAVING_RULES.NORULE;

	public CountableItem(String name, double price, int count) {
		super(name, price);
		this.count = count;
	}

	public CountableItem(String name, double price, int count, SAVING_RULES rule) {
		this(name, price, count);
		this.rule = rule;
	}

	public double getSubTotal() {
		return getPrice() * count;
	}

	public int getCount() {
		return count;
	}

	@Override
	public double getSaving() {
		if (rule == SAVING_RULES.BUY2FOR1)
			return new SavingRules().buy2for1(this);
		else if (rule == SAVING_RULES.BUY3GET1FREE)
			return new SavingRules().buy3get1Free(this);
		else
			return super.getSaving();
	}

}
