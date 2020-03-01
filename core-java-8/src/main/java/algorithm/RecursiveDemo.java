package algorithm;

public class RecursiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("Abhijit"));

	}
	
	static String reverseString(String str)
	{
		if ((null == str) || (str.length() <= 1))
        {
               return str;
        }
		return reverseString(str.substring(1)) + str.charAt(0);
		
	}

}
