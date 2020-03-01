package algorithm;

import java.util.HashSet;

//Code to find duplicate values is the array(number could be of any length).
public class DuplicateValueInArray {

	public static void main(String[] args) {
		 int arr[] = {84, 20, 4, 5, 20, 3, 5}; 
	        int arr_size = arr.length; 
	        printRepeating1(arr, arr_size);
	        printRepeating2(arr);
	}
	// Using array and loop
	public static void printRepeating1(int arr[], int size)  
    { 
        for(int i = 0 ; i< size; i++)
        {
        	for (int j = i+1 ; j<size; j++)
        	{
        		if(arr[i] == arr[j])
        			System.out.println(arr[i]);
        	}
        }
    } 
	
	// Using Set
	public static void printRepeating2(int arr[]) 
	{
		HashSet<Integer> no = new HashSet<>();
		for(int i : arr)
		{
			if(no.add(i) == false)
			{
				System.out.println("Duplicate : " + i);
			}
		}
	}
}
