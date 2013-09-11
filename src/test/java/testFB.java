import static org.junit.Assert.*;

import org.junit.Test;


public class testFB {
	FizzBuzz fb = new FizzBuzz();
	@Test
	public void verificarMultiploDe5() {
		for (int c = 5 ; c <= 100 ; c+=5)
		{
			assertEquals(true,fb.mult5(c));
		}
	}
	@Test
	public void verificarMultiploDe3() {
		for (int c = 3 ; c <= 99 ; c+=3)
		{
			assertEquals(true,fb.mult3(c));
		}
	}
	
	

}
