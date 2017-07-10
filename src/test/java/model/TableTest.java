package model;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jsimone on 6/19/17.
 */
public class TableTest {

	@Test(expected = IllegalArgumentException.class)
	public void constructorExceptionDimensionZero() {
		new Table(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorExceptionDimensionOne() {
		new Table(1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorExceptionDimensionNegative() {
		new Table(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorExceptionDimensionExceeds() {
		new Table(1000);
	}

	@Test
	public void positionIsAllowed() {
		Table tableTop = new Table(5);
		assertTrue(tableTop.isPositionAllowed(0, 0));
		assertTrue(tableTop.isPositionAllowed(0, 1));
		assertTrue(tableTop.isPositionAllowed(0, 2));
		assertTrue(tableTop.isPositionAllowed(0, 3));
		assertTrue(tableTop.isPositionAllowed(0, 4));

		assertTrue(tableTop.isPositionAllowed(0, 0));
		assertTrue(tableTop.isPositionAllowed(1, 0));
		assertTrue(tableTop.isPositionAllowed(2, 0));
		assertTrue(tableTop.isPositionAllowed(3, 0));
		assertTrue(tableTop.isPositionAllowed(4, 0));
	}

	@Test
	public void positionIsNotAllowed() {
		Table tableTop = new Table(5);
		assertFalse(tableTop.isPositionAllowed(0, -1));
		assertFalse(tableTop.isPositionAllowed(-1, -1));
		assertFalse(tableTop.isPositionAllowed(-1, 0));

		assertFalse(tableTop.isPositionAllowed(0, 5));
		assertFalse(tableTop.isPositionAllowed(5, 5));
		assertFalse(tableTop.isPositionAllowed(5, 0));
	}


}
