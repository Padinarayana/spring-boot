package in.suenra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {

	private static Calculator cal;
	
	@BeforeAll
	public static void setUpOnce() {
		cal=new Calculator();
	}
	@Test
	public void testAddWithBigNumbers() {
		int actual = cal.add(333333, 333333);
		int expected=666666;
		assertEquals(actual,expected);
	}
	
	
	@Test
	public void testAddWithPositiveNumbers() {
		int actual = cal.add(33, 00);
		int expected=33;
		assertEquals(actual,expected);
	}
	
	@Test
	public void testAddWithNeagtiveNumbers() {
		assertThrows(IllegalArgumentException.class, ()->{
			cal.add(-33, -23);
		});
	}
	
	@Test
	public void testMulWithPositiveNumbers() {
		int actual=cal.mul(2, 4);
		int expected=8;
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"rar","radar","dad"})
	public void testPalindrome(String str) {
		boolean actual = cal.palindrome(str);
		assertTrue(actual);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)
	public void testIsEvenOrOdd(int num,String expected) {
		String actual=cal.evenOrOdd(num);
		assertEquals(expected, actual);
		
	}
	
	@AfterAll
	public static void clearOnce() {
		cal=null;
	}
}
