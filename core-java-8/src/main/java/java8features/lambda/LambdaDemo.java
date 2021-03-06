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
		
		SumInterface obj = (a, b) -> a + b;		
		System.out.println("Sum : " + obj.sum(3, 6));
		
		SumInterface01 obj2 = (a, b) -> System.out.print(a*b);
		obj2.mul(4, 5);
		
	}
}

//functional  interface
interface SumInterface
{
	int sum(int a, int b);
}

interface SumInterface01
{
	void mul(int a, int b);
}