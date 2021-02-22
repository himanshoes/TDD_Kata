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
	
	@Test
	void testForStringWithTwoNumbersSeparatedByComma( ) {
		assertEquals(3,calculator.add("1,2"));
	}
	
	@Test
	void testForStringWithMultipleNumbersSeparatedWithComma() {
		assertEquals(10,calculator.add("1,2,3,4"));
	}
	
	@Test
	void testForStringHavingLineBreakAsDelimeter() {
		assertEquals(10,calculator.add("1,2\n3,4"));
	}
}
