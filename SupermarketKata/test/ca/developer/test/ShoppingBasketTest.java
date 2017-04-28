package ca.developer.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShoppingBasketTest {

	ShoppingBasket emptyBasket = new ShoppingBasket();
	ShoppingBasket oneBeanBasket = new ShoppingBasket();
	ShoppingBasket twoBeanBasket = new ShoppingBasket();
	ShoppingBasket orangeBasket = new ShoppingBasket();

	@Before
	public void setUp() throws Exception {
		oneBeanBasket.add(new CountableItem("Bean", 0.5, 1));
		twoBeanBasket.add(new CountableItem("Bean", 0.5, 2));
		orangeBasket.add(new UncountableItem("Orange", 0.200, 1.99));

	}

	@Test
	public void test() {
		assertEquals(emptyBasket.calculateSubTotal(), 0, 0);
		assertEquals(oneBeanBasket.calculateSubTotal(), 0.5, 0);
		assertEquals(twoBeanBasket.calculateSubTotal(), 1, 0);
		assertEquals(orangeBasket.calculateSubTotal(), 0.4, 0);

	}

}
