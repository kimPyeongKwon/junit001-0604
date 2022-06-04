package com.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Calculator;

public class CalculatorTest {

	@Test
	public void testSum() {
//		fail("Not yet implemented");
		Calculator calculator = new Calculator();
		assertEquals(30, calculator.sum(10, 20));
	}

}
