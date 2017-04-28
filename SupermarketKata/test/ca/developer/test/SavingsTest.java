package ca.developer.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ca.developer.test.SavingRules.SAVING_RULES;

public class SavingsTest {
	ShoppingBasket oneBean = new ShoppingBasket();
	ShoppingBasket threeBeansfor2 = new ShoppingBasket();
	ShoppingBasket fourBean = new ShoppingBasket();

	@Before
	public void setUp() throws Exception {
		oneBean.add(new CountableItem("Bean", 0.5, 1, SAVING_RULES.BUY3GET1FREE));
		threeBeansfor2.add(new CountableItem("Bean", 0.5, 3, SAVING_RULES.BUY3GET1FREE));
		fourBean.add(new CountableItem("Bean", 0.5, 4, SAVING_RULES.BUY3GET1FREE));
	}

	@Test
	public void savingsTest() {
		assertEquals(oneBean.calculateTotalSavings(), 0, 0);
		assertEquals(threeBeansfor2.calculateTotalSavings(), 0.5, 0);
		assertEquals(fourBean.calculateTotalSavings(), 0.5, 0);
	}

}
