package algorithm;
// NOT DONE
import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int []ar = {-3, 5, 2, 0, -1, -2, 1,4}; // missing 3
		int []ar = {3, 5,  1, 6, 4}; // missing 2
		
		missingFind(ar);
	}

	static void missingFind(int []ar)
	{
		Arrays.sort(ar);
		for(int a : ar)
		{
			System.out.println("after sort :" + a);
		}
		
		int count = ar.length;
		System.out.println("count :" + count);
		
		int [] postive = new  int[8];
		int index = 0;
		for(int i : ar)
		{
			if( i < 0)
			{
				postive[index] = -(i);
			}
			else if( i >= 0)
			{
				postive [index] = i;
			}
			index++;
		}
		for(int j : postive)
		{
			System.out.println("positivve :" + j);
		}
	}
}
