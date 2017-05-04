package co.technical.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShoppingBasketTest {

	ShoppingBasket emptyBasket, oneSoupBasket, twoSoupBasket, addBasket;

	@Before
	public void setUp() throws Exception {
		emptyBasket = new ShoppingBasket();
		oneSoupBasket = new ShoppingBasket();
		oneSoupBasket.addGood(new Good("Soup", 0.65));

		twoSoupBasket = new ShoppingBasket();
		twoSoupBasket.addGood(new Good("Soup", 0.65));
		twoSoupBasket.addGood(new Good("Soup", 0.65));

		addBasket = new ShoppingBasket();
	}

	@Test
	public void testGetSubtotal() {
		assertEquals(emptyBasket.getSubtotal().getPrice(), 0, 0);
		assertEquals(oneSoupBasket.getSubtotal().getPrice(), 0.65, 0);
		assertEquals(twoSoupBasket.getSubtotal().getPrice(), 1.30, 0);
	}

	@Test
	public void testAddGood() {
		addBasket.addGood(new Good("Soup", 0.65));
		assertEquals(addBasket.getBasket().containsKey(new Good("Soup", 0.65)), true);
		addBasket.addGood(new Good("Soup", 0.65));
		addBasket.addGood(new Good("Soup", 0.65));
		Integer count = addBasket.getBasket().get(new Good("Soup", 0.65));
		assertEquals(count.intValue(), 3);
	}

}
