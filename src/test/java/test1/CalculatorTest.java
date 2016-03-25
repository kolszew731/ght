package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int add = Calculator.add(1, 1);
		assertEquals(2, add);
	}

	@Test
	public void testSub() {
		int add = Calculator.sub(2, 1);
		assertEquals(1, add);
	}

}
