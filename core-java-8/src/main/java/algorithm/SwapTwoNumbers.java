package algorithm;
//Write a program to swap or exchange two numbers. You should
//not use any temporary or third variable to swap.
public class SwapTwoNumbers {

	public static void main(String[] args) {
		swapTwoNo(5, 3);
	}
	
	static void swapTwoNo(int a, int b)
	{
		System.out.println(a + ":::" + b);
		a = a +b; // 8
		b = a -b;  //5
		a = a - b; // 3
		
		
		System.out.println(a + ":::" + b);
	}

}
