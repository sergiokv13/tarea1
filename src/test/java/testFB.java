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
	@Test
	public void verificarFizzBuzzPorNumero(){
		assertEquals("FizzBuzz",fb.devolverFizzBuzz(15));
		assertEquals("Fizz",fb.devolverFizzBuzz(18));
		assertEquals("Buzz",fb.devolverFizzBuzz(25));
		assertEquals("17",fb.devolverFizzBuzz(17));
	}
	
	

}
