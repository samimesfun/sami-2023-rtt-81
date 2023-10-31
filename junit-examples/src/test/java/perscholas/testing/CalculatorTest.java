package perscholas.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import perscholas.testing.Calculator;

public class CalculatorTest {
	/*
	 * @Test public void additionTest() { Calculator c = new Calculator(); double
	 * expected = 10.0;
	 * 
	 * double actual = c.add(5.0, 5.0);
	 * 
	 * Assertions.assertEquals(expected,actual);
	 * 
	 * Assertions.assertEquals(15.0, c.add(7.5,7.5)); }
	 */

	// parameterized test for add

	@ParameterizedTest
	@CsvSource({ "5, 5, 10", "10, 10, 20", "5.5, 5.5, 11.0" })
	public void additionTest(double a, double b, double answer) {
		Calculator c = new Calculator();

		double actual = c.add(a, b);

		Assertions.assertEquals(answer, actual);
	}

	@ParameterizedTest
	@CsvSource({ "5, 5, 12", "10, 10, 20.5", "5.5, 5.5, 12.0" })
	public void additionErrorTest(double a, double b, double answer) {
		Calculator c = new Calculator();

		double actual = c.add(a, b);

		Assertions.assertEquals(15.0, c.add(7.5, 7.5));
		Assertions.assertNotEquals(answer, actual);
	}

	/*@Test
	public void subtractionTest() {
		Calculator c = new Calculator();
		double expected = 10.0;

		double actual = c.subtract(20.0, 10.0);

		Assertions.assertEquals(expected, actual);

		Assertions.assertEquals(15.0, c.subtract(20.0, 5.0));
	}

	@Test
	public void multiplicationTest() {
		Calculator c = new Calculator();
		double expected = 10.0;

		double actual = c.multiply(20.0, 10.0);

		Assertions.assertEquals(expected, actual);

		Assertions.assertEquals(15.0, c.subtract(20.0, 5.0));
		
	}*/
	@ParameterizedTest
	@CsvSource({ "35, 5, 30", "30, 10, 20", "15.5, 5.5, 10.0" })
	public void subtractionTest(double a, double b, double answer) {
		Calculator c = new Calculator();

		double actual = c.subtract(a, b);

		Assertions.assertEquals(answer, actual);
	}

	@ParameterizedTest
	@CsvSource({ "15, 5, 13", "12, 10, 4", "50.5, 15.5,34.0" })
	public void subtractionErrorTest(double a, double b, double answer) {
		Calculator c = new Calculator();

		double actual = c.subtract(a, b);

		Assertions.assertEquals(15.0, c.subtract(25.0,10.0));
		Assertions.assertNotEquals(answer, actual);
	}
	
}
