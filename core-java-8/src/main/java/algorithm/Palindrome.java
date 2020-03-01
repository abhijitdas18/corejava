package algorithm;
// a number that is same after reverse. 
public class Palindrome {

	public static void main(String[] args) {

		getPalindromeInt(34543);
		getPalindromeString("Heelo");
		getPalindromeString("HelleH");
	}
	
	
	public static void  getPalindromeInt(int num)
	{
		int reverseNo = 0;
		int originalNo = num;
		
		while(num>0)
		{
			int remmainder = num % 10;
			reverseNo = reverseNo * 10 + remmainder;
			num = num / 10;
		}
		
		System.out.println("REverse : " + reverseNo);
		
		if( reverseNo == originalNo)
		{
			System.out.println("the num is palindrome");
		}
		else
		{
			System.out.println("the number is NOT palindrome");
		}
	}
	
	public static void getPalindromeString(String str)
	{
		String originalStr = str;
		String reverseStr ="";
		for(int i = str.length() -1; i >= 0 ; i--)
		{
			reverseStr = reverseStr + str.charAt(i);
		}
		System.out.println("REverse : " + reverseStr);
		
		if( reverseStr.equals(originalStr))
		{
			System.out.println("the num is palindrome");
		}
		else
		{
			System.out.println("the number is NOT palindrome");
		}
	}

}
