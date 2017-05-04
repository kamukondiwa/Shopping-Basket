
package co.technical.test.offer;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import co.technical.test.AvailableGoods;
import co.technical.test.Good;

public class BuyTwoSoupBread50Test {
	BuyTwoSoupBread50 breadOffer;
	Map<Good, Integer> emptyGoodList, oneList, moreList;

	@Before
	public void setUp() throws Exception {
		breadOffer = new BuyTwoSoupBread50();
		emptyGoodList = new HashMap<Good, Integer>();
		oneList = new HashMap<Good, Integer>();
		oneList.put(AvailableGoods.SOUP, 1);

		moreList = new HashMap<Good, Integer>();
		moreList.put(AvailableGoods.SOUP, 3);
		moreList.put(AvailableGoods.BREAD, 3);
	}

	@Test
	public void testisMatch() {
		assertEquals(breadOffer.isMatch(emptyGoodList), false);
		assertEquals(breadOffer.isMatch(oneList), false);
		assertEquals(breadOffer.isMatch(moreList), true);
	}

	@Test
	public void testGetOffer() {
		assertEquals(breadOffer.getOffer(emptyGoodList).getPrice(), 0);
		assertEquals(breadOffer.getOffer(oneList).getPrice(), 0);
		assertEquals(breadOffer.getOffer(moreList).getPrice(), 40);
	}

}
