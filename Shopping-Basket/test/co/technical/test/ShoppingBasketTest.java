package co.technical.test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import co.technical.test.price.OfferPrice;

public class ShoppingBasketTest {

	ShoppingBasket emptyBasket, oneSoupBasket, twoSoupBasket, addBasket, offerBasket;

	@Before
	public void setUp() throws Exception {
		emptyBasket = new ShoppingBasket();
		oneSoupBasket = new ShoppingBasket();
		oneSoupBasket.addGood(TestUtil.SOUP);

		twoSoupBasket = new ShoppingBasket();
		twoSoupBasket.addGood(TestUtil.SOUP);
		twoSoupBasket.addGood(TestUtil.SOUP);

		addBasket = new ShoppingBasket();

		offerBasket = new ShoppingBasket();
	}

	@Test
	public void testGetSubtotal() {
		assertEquals(emptyBasket.getSubtotal().getPrice(), 0);
		assertEquals(oneSoupBasket.getSubtotal().getPrice(), 65);
		assertEquals(twoSoupBasket.getSubtotal().getPrice(), 130);
	}

	@Test
	public void testAddGood() {
		addBasket.addGood(TestUtil.SOUP);
		assertEquals(addBasket.getBasket().containsKey(TestUtil.SOUP), true);
		addBasket.addGood(TestUtil.SOUP);
		addBasket.addGood(TestUtil.SOUP);
		Integer count = addBasket.getBasket().get(TestUtil.SOUP);
		assertEquals(count.intValue(), 3);
	}

	@Test
	public void testOffers() {
		offerBasket.addGood(TestUtil.APPLES);
		Map<String, OfferPrice> offers = offerBasket.getOffers();
		assertEquals(offers.containsValue(new OfferPrice(10)), true);
	}

}
