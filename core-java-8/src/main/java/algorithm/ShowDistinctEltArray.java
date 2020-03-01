package algorithm;
//The below example shows how to avoid duplicate elements from an array
//and disply only distinct elements. Please use only arrays to process it.

public class ShowDistinctEltArray {

	public static void main(String[] args) {
		int [] ar = {2,5,1,5,3};
		showDistinctElementArray(ar);
	}
	
	static void showDistinctElementArray(int [] nums)
	{
		boolean isDuplicate = false;
		for(int i = 0; i< nums.length; i++) 
		{
			for(int j= 0; j <i ; j++)
			{
				if(nums[i] == nums[j])
				{
					isDuplicate = true;
					break;
				}
				
			}
			if(!isDuplicate)
				 System.out.println(nums[i]);
		}
		
	}

}
