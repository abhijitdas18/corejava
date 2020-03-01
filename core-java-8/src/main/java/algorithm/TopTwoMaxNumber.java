package algorithm;
//Write a program to find top two maximum numbers in the
//given array. You should not use any sorting functions. You
//should iterate the array only once. You should not use any
//kind of collections in java.
public class TopTwoMaxNumber {

	public static void main(String[] args) {
		topTwoMaxNumber(new Integer[] {2,7,4,23,1});
	}
	
	static void topTwoMaxNumber(Integer[] nums)
	{
		int max1 = 0;
		int max2 = 0;
		for(int num : nums)
		{
			if(max1 < num)
			{
				max2 = max1;
				max1 = num;				
			}
			else if(max2  < num)
			{
				max2 = num;
			}
		}
		System.out.println("max1 : " + max1);
		System.out.println("max2 : " + max2);
	}

}
