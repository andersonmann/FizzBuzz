package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzJUnitTest {

	@Test
	public void testFizzBuzz() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
	}
	
	@Test
	public void testFizzBuzzErro() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(99));
	}

	@Test
	public void testFizz() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(12));
	}

	@Test
	public void testMBuzz() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
	}

	@Test
	public void testNumber() {
		assertEquals("11", FizzBuzz.fizzBuzz(11));
	}

}
