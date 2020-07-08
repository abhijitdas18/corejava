package algorithm;

import java.util.HashMap;
import java.util.Map;

// Count the occurrences of the each digit in an infinite numbers
// 123221244...456321034566....
public class CountForInfiniteNumber {

	public static void main(String[] args) {

		String numbers = "1232145039504321054378013269432";
		findOccurenceOfDigit(numbers);
	}

	// public char[] toCharArray()
	// the numeric value of the character, as a nonnegative int value; -2 if the character has a
	// numeric value but the value can not be represented as a nonnegative int value;
	// -1 if the character has no numeric value.
	static void findOccurenceOfDigit(String number)
	{
		char [] ch = number.toCharArray();
		int [] n = new int[10];
		for(char c : ch)
		{
			if(Character.getNumericValue(c) == 0)
			{
				n[0] = n[0] + 1;
			}
			if(Character.getNumericValue(c) == 1)
			{
				n[1] = n[1] + 1;
			}
			if(Character.getNumericValue(c) == 2)
			{
				n[2] = n[2] + 1;
			}
			if(Character.getNumericValue(c) == 3)
			{
				n[3] = n[3] + 1;
			}
			if(Character.getNumericValue(c) == 4)
			{
				n[4] = n[4] + 1;
			}
			if(Character.getNumericValue(c) == 5)
			{
				n[5] = n[5] + 1;
			}
			if(Character.getNumericValue(c) == 6)
			{
				n[6] = n[6] + 1;
			}
			if(Character.getNumericValue(c) == 7)
			{
				n[7] = n[7] + 1;
			}
			if(Character.getNumericValue(c) == 8)
			{
				n[8] = n[8] + 1;
			}
			if(Character.getNumericValue(c) == 9)
			{
				n[9] = n[9] + 1;
			}
			
		}
		
		Map<Integer, Integer> result = new HashMap<>();
		for(int i = 0; i<n.length; i++)
		{
			result.put(i, n[i]);
		}
		
		result.forEach((key,value)-> System.out.println( key + "::-> " + value + " Times."));
	}
}
