
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public boolean mult5(int num)
	{
		if ( num % 5 == 0)
			return true;
		else
			return false;
	}
	
	public boolean mult3(int num)
	{
		if ( num % 3 == 0)
			return true;
		else
			return false;
	}

	public String devolverFizzBuzz(int num)
	{
		String res = "";
		if (this.mult3(num) || this.mult5(num))
		{
			if (this.mult3(num))
				res+="Fizz";
			if (this.mult5(num))
				res+="Buzz";
		}
		else
		res= Integer.toString(num);
		
		return res;			
	}
}
