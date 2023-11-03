package com.Assignment.Test;

import org.junit.jupiter.api.Test;

import com.vn.assignment.Controller.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	Calculator calculator = new Calculator();

	@Test
	public void testAddition() {
		String result = calculator.addition(5, 3);
		assertEquals("answer : 8,detail : 5+3=8", result);
	}

	@Test
	public void testSubtraction() {
		String result = calculator.subtraction(10, 4);
		assertEquals("answer : 6,detail : 10-4=6", result);
	}

	@Test
	public void testMultiplication() {
		String result = calculator.multiplication(7, 6);
		assertEquals("answer : 42,detail : 7*6=42", result);
	}

	@Test
	public void testDivision() {
		String result = calculator.division(20, 5);
		assertEquals("answer : 4,detail : 20/5=4", result);
	}

	@Test
	public void testSquare() {
		String result = calculator.square(4);
		assertEquals("answer : 16,detail : square of 4 = 16", result);
	}

	@Test
	public void testSquareRoot() {
		String result = calculator.squareroot(9);
		assertEquals("answer : 3.0,detail : squareroot of 9 = 3.0", result);
	}

	@Test
	public void testFactorial() {
		String result = calculator.factorial(5);
		assertEquals("answer : 120, detail : squareroot of 5 = 120", result);
	}

	@Test
	public void testMinMax() {
		String result = calculator.min_max();
		assertEquals("answer min: 7 max 652, detail : min & max 7 & 652", result);
	}
}
