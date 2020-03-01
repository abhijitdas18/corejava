package algorithm;
///how to reverse both primitive and object array in Java.
public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = {10,4,-3,7,9};
		reverseArray(arr);
		
		String [] str = {"one", "two", "three", "four", "five"};
		reverseArrayString(str);
	}
	public static void reverseArray(int[] arr)
	{
		for(int i = arr.length-1 ; i>=0 ; i--)
		{
			System.out.print(arr[i] +",");
		}
	}
	
	public static void reverseArrayString(String []arr)
	{
		for(int i = arr.length - 1 ; i>= 0 ;i--)
		{
			System.out.println(arr[i] + ",");
		}
	}

}
