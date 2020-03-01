package algorithm;

public class BinarySearch01 {

	public static void main(String[] args) {

		int arr[] = {12,34,50, 79, 100, 166,876,5432};
		int key = 79;
		
		binarySearch(arr,  0, arr.length-1, key);
	}
	
	public static void  binarySearch(int arr[], int first, int last, int key )
	{
		int mid = (first + last)/2;
		
		while(first <= last)
		{
			if(arr[mid] < key)  // key is in the 2nd half 
			{
				first = mid + 1;
				
			}else if( arr[mid] == key )
			{
				System.out.println("Elment is found. Index is : "+ mid);
				break;
			}else
			{
				last = mid -1;
			}
			
			mid = (first + last) /2;
		}
		
		if(first > last)
			System.out.println("Element not found.");
		
	}

}
