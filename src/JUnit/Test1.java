package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void testAdd() {
			Calculator1 c = new Calculator1(2,4);
			assertEquals(6, c.add());
		}

		@Test
		public void testSubtract() {
			Calculator1 c = new Calculator1(5,3);
			assertEquals(2, c.subtract());
		}

		@Test
		public void testMultiply() {
			Calculator1 c = new Calculator1(6,5);
			assertEquals(30, c.multiply());
		}

		@Test
		public void testDivide() {
			Calculator1 c = new Calculator1(8,1);
			assertEquals(8, c.divide());
		}

}
