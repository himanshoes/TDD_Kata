package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	StringCalculator calculator = new StringCalculator();
	
	@Test
	void testForEmptyString() {
		assertEquals(0,calculator.add(""));
	}
	
	@Test
	void testForStringWithOneNumber( ) {
		assertEquals(1,calculator.add("1"));
	}

}
