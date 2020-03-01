package algorithm;

public class SecondHeightstNumber {

	public static void main(String[] args) {
		
		int [] nums = {19,12,4,10,5,11,6};

		secondHighstNum(nums);
	}

    static void secondHighstNum(int []nums)
    {
    	int firstHighest = Integer.MIN_VALUE;
    	int secondHighest = Integer.MIN_VALUE;
    	
    	System.out.println(nums.length);
    	
    	for(int i = 0 ; i < nums.length-1; i++)
    	{
    		if(nums[i] > firstHighest)
    		{
    			secondHighest = firstHighest;
    			firstHighest = nums[i];   		
    			
    		}
    		else if(nums[i] > secondHighest)
    		{
    			secondHighest = nums[i];
    		}
    		
    	}
    	System.out.println("First : " + firstHighest);
    	System.out.println("Second :" + secondHighest);
    	
    }
}
