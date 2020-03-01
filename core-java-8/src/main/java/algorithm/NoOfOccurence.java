package algorithm;
// find the no. of occurence of each character in the string.
import java.util.LinkedHashMap;
import java.util.Set;

public class NoOfOccurence {

	public static void main(String[] args) {
		func("ddaxyxeffeabcabbbccabd");

	}

	public static void func(String str)
	{
		char[] chrs = str.toCharArray(); // convert the string into char array
		LinkedHashMap<Character, Integer> maps = new LinkedHashMap<>();
		
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
		String str1 = "";
		for(Character c : keysSet) {
			if(maps.get(c) > 1)
			{
				System.out.println("Duplicate found.  for : " + c + "  count : " +  maps.get(c));
				str1 = str1 + ""+ c + maps.get(c);
			}
		}
		
		System.out.println(str1);
		
		if(str1.contains(""))
		{
			System.out.println("Y");
		}
		else
		{
			System.out.println("N");
		}
		
		str1 = str1.replaceAll("\\s",""); 
		if(str1.contains(" "))
		{
			System.out.println("Y");
		}
		else
		{
			System.out.println("N");
		}
		
		
		
	}
}
