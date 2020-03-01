package algorithm;

public class Factorial {

	public static void main(String[] args) {
		factorial(5);
	}
	
	public static void factorial(int num)
	{
		int fac = 1;
		while(num >0)
		{
			fac = fac * num;
			num--;
		}
		
		System.out.println("No :" + fac);
	}

}
