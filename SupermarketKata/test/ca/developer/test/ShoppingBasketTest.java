package ca.developer.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShoppingBasketTest {

	ShoppingBasket emptyBasket = new ShoppingBasket();
	ShoppingBasket oneBeanBasket = new ShoppingBasket();
	ShoppingBasket twoBeanBasket = new ShoppingBasket();

	@Before
	public void setUp() throws Exception {
		oneBeanBasket.add(new Item("Bean", 0.5, 1));
		twoBeanBasket.add(new Item("Bean", 0.5, 2));

	}

	@Test
	public void test() {
		assertEquals(emptyBasket.calculateSubTotal(), 0, 0);
		assertEquals(oneBeanBasket.calculateSubTotal(), 0.5, 0);
		assertEquals(twoBeanBasket.calculateSubTotal(), 1, 0);

	}

}
