package java8features.lambda;

import java.util.List;
import java.util.ArrayList;

public class MyLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface addition = (int a, int b) -> a+ b;
		System.out.println(addition.sum(3, 5));
		
		MyInterface inner = new MyInterface() {
		   public int sum(int x, int y)
		   {
			   return x+ y;
		   }
		};
		
		System.out.println(inner.sum(2, 4));
		
		MyInter goooo = () -> System.out.println("hi");
		goooo.goo();
		
		List<String> names = new ArrayList();
		names.add("aa1");
		names.add("aa2");
		names.add("aa3");
		names.add("aa4");
		
		names.forEach(x -> System.out.println(x));			
		
	}

}
interface MyInterface 
{
	int sum(int a, int b);
	default void foo()
	{
		System.out.println("foo");
		
	}
}

interface MyInter
{
	void goo();
}
