import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit_Test_Case {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		NumberToWord obj = new NumberToWord();
		int res = NumberToWord.sumOfDigits(321);
		assertEquals(6, res);
		
	}

}
