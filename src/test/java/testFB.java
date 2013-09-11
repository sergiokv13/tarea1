import static org.junit.Assert.*;

import org.junit.Test;


public class testFB {
	FizzBuzz fb = new FizzBuzz();
	@Test
	public void verificarCorrerTest() {
		assertEquals(2, fb.verificarTest());
	}

}
