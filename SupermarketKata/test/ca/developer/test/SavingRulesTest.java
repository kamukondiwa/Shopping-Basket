package ca.developer.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SavingRulesTest {
	
	SavingRules rules = new SavingRules();

	@Test
	public void buy3get1FreeTest() {
		assertEquals(rules.buy3get1Free(new CountableItem("Bean", 0.5, 1)), 0, 0);
		assertEquals(rules.buy3get1Free(new CountableItem("Bean", 0.5, 2)), 0, 0);
		assertEquals(rules.buy3get1Free(new CountableItem("Bean", 0.5, 3)), 0.5, 0);
		assertEquals(rules.buy3get1Free(new CountableItem("Bean", 0.5, 4)), 0.5, 0);
		assertEquals(rules.buy3get1Free(new CountableItem("Bean", 0.5, 5)), 0.5, 0);
		assertEquals(rules.buy3get1Free(new CountableItem("Bean", 0.5, 6)), 1, 0);
	}

	@Test
	public void buy2for1Test() {
		assertEquals(rules.buy2for1(new CountableItem("Bean", 0.7, 1)), 0, 0);
		assertEquals(rules.buy2for1(new CountableItem("Bean", 0.7, 2)), 0.4, 0);
		assertEquals(rules.buy2for1(new CountableItem("Bean", 0.7, 3)), 0.4, 0);
		assertEquals(rules.buy2for1(new CountableItem("Bean", 0.7, 4)), 0.8, 0);
		assertEquals(rules.buy2for1(new CountableItem("Bean", 0.7, 5)), 0.8, 0);
		assertEquals(rules.buy2for1(new CountableItem("Bean", 0.7, 6)), 1.2, 0);

	}
}
