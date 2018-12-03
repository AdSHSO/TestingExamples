import static org.junit.Assert.*;

import org.junit.Test;

public class withdrawTest {

		@Test(expected = IllegalArgumentException.class)
		public void testExceptionIsThrown() {
		  Account tester = new Account(500);
		  tester.withdraw(400);
		}

		@Test
		public void testWithdraw() {
		Account tester = new Account(500);
		  assertEquals("300 withdrawn from 500 must be 200", 200, tester.withdraw(300));
		}

}


