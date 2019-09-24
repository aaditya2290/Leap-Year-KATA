package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import main.LeapYear;

import org.junit.Before;
import org.junit.Test;

public class LeapYearTest {

	LeapYear ly;

	@Before
	public void initializeLeapYear()
	{
		ly=new LeapYear();
	}

	@Test
	public void testNotDivisibileBy4IsNotLeapYear()
	{
		assertFalse(isLeap(10));
	}

	@Test
	public void testDivisibileBy4NotDivisibleBy100IsLeapYear()
	{
		assertTrue(isLeap(16));
	}

	@Test
	public void testDivisibileBy4DivisibleBy100Divisibleby400IsLeapYear()
	{
		assertTrue(isLeap(400));
	}

	private boolean isLeap(int year)
	{
		return ly.isLeapYear(year);
	}

}
