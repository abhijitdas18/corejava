package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Two sorted Array of integer given.
 * Create a array with sorted integer  
 * @author AbDas
 *
 */
public class ArrayOperation {

	public static void main(String[] args) {
		
		String str = "hello";
		System.out.println("Lenght of string :" + str.length());

		/////////////////////////////////
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {6,7,8,9,10};
		
		int size1 = arr1.length;
		int size2 = arr2.length;
		int [] res = new int [size1 + size2];
		TreeSet<Integer> result = new TreeSet<>();
		for(int a : arr1)
		{
			result.add(a);
		}
		System.out.println(result);
		for(int a : arr2)
		{
			result.add(a);
		}
		System.out.println(result);
		
		
		///////////////////////////////////
		
	   List<Integer> nos = new ArrayList<Integer>();
	   nos.add(10);
	   nos.add(11);
	   nos.add(110);
	   nos.add(210);
	   
	   System.out.println("Size:" + nos.size());
	   
	   ///////////////////
	   
	   
	   
	}

}
