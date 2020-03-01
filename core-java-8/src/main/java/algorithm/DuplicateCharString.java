package algorithm;

import java.util.HashMap;
import java.util.Set;

//Write a program to find out duplicate or repeated characters in a
//string, and calculate the count of repeatation.
public class DuplicateCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateCharString("abcabbb");

	}
	
	static void duplicateCharString(String str)
	{
		char[] chrs = str.toCharArray(); // convert the string into char array
		HashMap<Character, Integer> maps = new HashMap<>();
		
		for(char ch : chrs)
		{
			if(maps.containsKey(ch))
			{
				maps.put(ch, maps.get(ch) + 1);
			}
			else
			{
				maps.put(ch, 1);
			}
			
		}
		
		System.out.println(maps);
		Set<Character> keysSet = maps.keySet();
		System.out.println("Unique char are : " + keysSet);
		for(Character c : keysSet) {
			if(maps.get(c) > 1)
			{
				System.out.println("Duplicate found.  for : " + c + "  count : " +  maps.get(c));
			}
		}
		
	}

}
