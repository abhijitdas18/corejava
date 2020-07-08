package algorithm;

import java.util.Arrays;

//Two strings are called anagrams if they contain same set of characters but in different order.
// For example, �Dormitory � Dirty Room�,
//�keep � peek�,  �School Master � The Classroom� are some anagrams.
public class CompareTwoStringWithSameCharacter {

	public static void main(String[] args) {

		String s1 = "DORMITOE;Y";
		String s2 = "Dirty Room";
		
		checkAnagrams(s1, s2);
	}
	
	static void checkAnagrams(String s1 , String s2)
	{
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		// Remove the whitespace
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		//Sort the arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		//Use equals 
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It is Anagrams");
		}
		else
		{
			System.out.println("It is not Anagrams");
		}
		
		
		
	}

}
