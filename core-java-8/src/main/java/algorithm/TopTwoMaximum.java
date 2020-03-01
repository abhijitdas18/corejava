package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopTwoMaximum {

	public static void main(String[] args) {

		topTwo(new int[] {3,457,12,9, 34, 1});
		List <Integer> no = new ArrayList<>();
				
		
	}
	
	public static void topTwo(int[] numbers)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;	
		
		for(int num : numbers)
		{
			if(num > max1)
			{
				max2 = max1;
				max1 = num;
				
				
			}
			else if( num > max2)
			{
				max2 = num;
			}
		}
		
		System.out.println("Given array :" + Arrays.toString(numbers));
		System.out.println("MAX1 : " + max1 + ", MAX2 : " + max2);
	}

}
