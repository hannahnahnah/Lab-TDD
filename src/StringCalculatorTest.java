import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void testNone() {
		String actual = StringCalculator.add("");
		String expected = "0";
		assertEquals(expected, actual);
	}
	
	@Test
	void testNone2() {
		String actual = StringCalculator.add("0");
		String expected = "0";
		assertEquals(expected, actual);
	}
	
	@Test
	void testNone3() {
		String actual = StringCalculator.add(null);
		String expected = "0";
		assertEquals(expected, actual);
	}
	
	@Test
	void testOne() {
		String actual = StringCalculator.add("1");
		String expected = "1";
		assertEquals(expected, actual);
	}
	
	@Test
	void testOne2() {
		String actual = StringCalculator.add("327");
		String expected = "327.0";
		assertEquals(expected, actual);
	}
	
	@Test
	void testTwoNumbers() {
		String actual = StringCalculator.add("2,5");
		String expected = "7.0";
		assertEquals(expected, actual);
	}
	
	@Test
	void testWithDecimals() {
		String actual = StringCalculator.add("2.5,5.1");
		String expected = "7.6";
		assertEquals(expected, actual);
	}
	
	@Test
	void testMultipleNumbers() {
		String actual = StringCalculator.add("2,5,8,2.2,4.7");
		String expected = "21.9";
		assertEquals(expected, actual);
	}
	
	@Test
	void testMultipleDelimiters() {
		String actual = StringCalculator.add("1\n2,3");
		String expected = "6.0";
		assertEquals(expected, actual);
	}
	
	@Test
	void testMultipleDelimiters2() {
		String actual = StringCalculator.add("1,0\n2,3");
		String expected = "6.0";
		assertEquals(expected, actual);
	}
	
	@Test
	void testExtraDelimiter() {
		String actual = StringCalculator.add("1,2,3,");
		String expected = "6.0";
		assertEquals(expected, actual);
	}
	
	@Test
	void testExtraDelimiter2() {
		String actual = StringCalculator.add("1.3,2,3,,");
		String expected = "6.3";
		assertEquals(expected, actual);
	}
	
//	@Test
//	void testAnyDelimiter() {
//		String actual = StringCalculator.add("1&\n2$3,");
//		String expected = "6.0";
//		assertEquals(expected, actual);
//	}
	
	
	
	
	
	
	


}//class
