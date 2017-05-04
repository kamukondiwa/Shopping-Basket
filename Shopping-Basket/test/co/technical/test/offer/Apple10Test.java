package co.technical.test.offer;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import co.technical.test.Good;
import co.technical.test.TestUtil;

public class Apple10Test {
	Apple10 appleOffer;
	Map<Good, Integer> emptyGoodList, oneAppleList, moreAppleList;

	@Before
	public void setUp() throws Exception {
		appleOffer = new Apple10();
		emptyGoodList = new HashMap<Good, Integer>();
		oneAppleList = new HashMap<Good, Integer>();
		oneAppleList.put(TestUtil.APPLES, 1);

		moreAppleList = new HashMap<Good, Integer>();
		moreAppleList.put(TestUtil.APPLES, 5);
	}

	@Test
	public void testisMatch() {
		assertEquals(appleOffer.isMatch(emptyGoodList), false);
		assertEquals(appleOffer.isMatch(oneAppleList), true);
		assertEquals(appleOffer.isMatch(moreAppleList), true);
	}

	@Test
	public void testGetOffer() {
		assertEquals(appleOffer.getOffer(emptyGoodList).getPrice(), 0);
		assertEquals(appleOffer.getOffer(oneAppleList).getPrice(), 10);
		assertEquals(appleOffer.getOffer(moreAppleList).getPrice(), 50);
	}

}
