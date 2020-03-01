package algorithm;

import java.util.HashSet;

public class RemoveDupilcateNumber {

	public static void main(String[] args) {
		
		int[] nums = {12,2,4,3,6,1, 4,12,8,1};
		removeDuplicateInterger(nums);

	}

	static void removeDuplicateInterger(int [] nums)
	{
		HashSet<Integer> finalValue = new HashSet<>();
		for (int n : nums)
		{
			if(finalValue.contains(n) == false)
			{
				finalValue.add(n);
			}
		}
		
		System.out.println(finalValue);
		
	}
}
