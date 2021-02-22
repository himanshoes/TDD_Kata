package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void testForEmptyString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0,calculator.add(""));
	}
	
	@Test
	void testForStringWithOneNumber( ) {
		StringCalculator calculator = new StringCalculator();
		assertEquals(1,calculator.add("1"));
	}

}
