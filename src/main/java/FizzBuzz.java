
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		imprimir();
	}
	
	public static boolean mult5(int num)
	{
		if ( num % 5 == 0)
			return true;
		else
			return false;
	}
	
	public  static boolean mult3(int num)
	{
		if ( num % 3 == 0)
			return true;
		else
			return false;
	}

	public static String devolverFizzBuzz(int num)
	{
		String res = "";
		if (mult3(num) || mult5(num))
		{
			if (mult3(num))
				res+="Fizz";
			if (mult5(num))
				res+="Buzz";
		}
		else
		res= Integer.toString(num);
		
		return res;			
	}
	
	public static void imprimir()
	{
		for(int c=1;c<=100;c++)
		{
			System.out.println(devolverFizzBuzz(c));
		}
	}
}
