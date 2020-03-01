package general;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayConcept {

	public static void main(String[] args) {

		int []ar = new int[3];
		
		for(int i : ar)
		{
			System.out.println("i : " + i);
		}
		
		String []str = new String[3];
		for(String s : str)
		{
			System.out.println("s" + str);
		}
		
		String names [] = new String[] {"abhi", "raj", "madhu"};
		
		//Returns a string representation of the contents of the specified array. 
		//The string representation consists of a list of the array's elements, enclosed in square brackets ("[]").
		System.out.println(Arrays.toString(names));  
		System.out.println("length :" + names.length);
		System.out.println("intdex 2 : " + names[2]);
		
		names[2] = "Ravi";
		System.out.println("index 2 : " + names[2]);
		names[3] = "abc";
		System.out.println("index 3 " + names[3]); //ArrayIndexOutOfBoundsException
		
		HashSet <Integer> hash = new HashSet<>();
	}

}
