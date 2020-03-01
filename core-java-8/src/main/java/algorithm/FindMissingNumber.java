package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// find the missing no from 1 to n
public class FindMissingNumber {

	public static void main(String[] args) {

		Integer [] nos = new Integer[]{1,2,3,5};
		int reqNo = findMissingNum(nos);
		System.out.println(reqNo);
		
		// 2nd approach add no. upto 10 in a list
		// suffle the numbers
		// remove a number from the list
		List<Integer> newNos = new ArrayList<>();
		for (int i = 0; i<10; i++)
		{
			newNos.add(i+1);
		}
		
		System.out.println(newNos);
		Collections.shuffle(newNos);
		System.out.println(newNos);
		int removeNo = newNos.remove(0);
		System.out.println(newNos);
		System.out.println("Remove no :" + removeNo);
		Integer [] arr = new Integer[newNos.size()];
		removeNo = findMissingNum(newNos.toArray(arr));
		System.out.println("Remove no :" + removeNo);
				
	}

	static int findMissingNum(Integer[] numbers)
	{
		int sum = 0;
		for(int i : numbers)
		{
			sum = sum + i;
		}
		/**
		 * Sum of 1 to n numbers
		 * n*(n+1)/2
		 */
		int noCount = numbers.length + 1; // including the missing no.
		int sumOfNNumbers = noCount * (noCount +1)/ 2; // including the missing no.
		
		int missingNo = sumOfNNumbers - sum;
		return missingNo;
		
	}
}
