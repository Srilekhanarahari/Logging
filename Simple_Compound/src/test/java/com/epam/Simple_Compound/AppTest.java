package com.epam.Simple_Compound;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	Simple s;
	@Before
	public void init()
	{
		s=new Simple();
	}

	@Test
	public void testInterest() {
		
		assertEquals(24,s.simpleInterest(1200,1,2),0);
		assertEquals(1200,s.compoundInterest(6000,20,1),0);
	}
}
