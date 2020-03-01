package java8features.lambda;

public class LambdaDemo
{
	public static void main(String []ar)
	{
		// SumInterfaceInterfaceof two number
		SumInterface sumIntr = new SumInterface() {
			
			@Override
			public int sum(int a, int b) {
				return a+ b;
			}
		};
		
		System.out.println(sumIntr.sum(2, 6));
	}
}

//functional  interface
interface SumInterface
{
	int sum(int a, int b);
}