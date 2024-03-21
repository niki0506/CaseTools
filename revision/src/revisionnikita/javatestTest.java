package revisionnikita;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class javatestTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void testadd() {
		javatest obj=new javatest();
		int expected=6;
		int actual=obj.add(3,3);
		assertEquals(expected,actual);
	}
	@Test
	void testmult() {
		javatest obj1=new javatest();
		int expected=9;
		int actual=obj1.mult(3,3);
		assertEquals(expected,actual);
	}

}
