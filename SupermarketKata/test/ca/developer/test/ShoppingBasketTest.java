package ca.developer.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ca.developer.test.SavingRules.SAVING_RULES;

public class ShoppingBasketTest {

	ShoppingBasket emptyBasket = new ShoppingBasket();
	ShoppingBasket oneBeanBasket = new ShoppingBasket();
	ShoppingBasket twoBeanBasket = new ShoppingBasket();
	ShoppingBasket orangeBasket = new ShoppingBasket();
	ShoppingBasket allinBasket = new ShoppingBasket();

	@Before
	public void setUp() throws Exception {
		oneBeanBasket.add(new CountableItem("Bean", 0.5, 1));
		twoBeanBasket.add(new CountableItem("Bean", 0.5, 2));
		orangeBasket.add(new UncountableItem("Orange", 0.200, 1.99));

		allinBasket.add(new CountableItem("Bean", 0.5, 3, SAVING_RULES.BUY3GET1FREE));
		allinBasket.add(new CountableItem("Coke", 0.7, 2, SAVING_RULES.BUY2FOR1));
		allinBasket.add(new UncountableItem("Orange", 0.200, 1.99));
	}

	@Test
	public void subTotalTest() {
		assertEquals(emptyBasket.calculateSubTotal(), 0, 0);
		assertEquals(oneBeanBasket.calculateSubTotal(), 0.5, 0);
		assertEquals(twoBeanBasket.calculateSubTotal(), 1, 0);
		assertEquals(orangeBasket.calculateSubTotal(), 0.4, 0);
	}

	@Test
	public void totaltoPayTest() {
		assertEquals(allinBasket.calculateSubTotal(), 3.30, 0);
		assertEquals(allinBasket.calculateTotalSavings(), 0.90, 0);
		assertEquals(allinBasket.calculateTotaltoPay(), 2.40, 0);
	}
}
