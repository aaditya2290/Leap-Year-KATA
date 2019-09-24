package test;

import static org.junit.Assert.*;
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

	private boolean isLeap(int year)
	{
		return ly.isLeapYear(year);
	}

}
