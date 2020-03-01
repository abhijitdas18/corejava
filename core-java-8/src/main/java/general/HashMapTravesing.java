package general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTravesing {

	public static void main(String[] args) {

		HashMap <Integer, String> names = new HashMap<>();
		names.put(1, "Abhijit");
		names.put(432, "Rajat");
		names.put(341, "Ravi");
		names.put(901,  "Raja");
		
		
		
		LinkedHashMap <Integer, String> orderedNames = new LinkedHashMap<>();
		orderedNames.put(121, "Abhijit");
		orderedNames.put(432, "Rajat");
		orderedNames.put(341, "Ravi");
		orderedNames.put(901,  "Raja");
		
		
		System.out.println("++++++++++++++++++ Iterator++++++++++++++++++++");
		
		Set <Entry<Integer, String>> set = orderedNames.entrySet();
		Iterator itr = set.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
		
		
		System.out.println("++++++++++++++using Set ++++++++++++++++");
		Set<Integer> rollSet = names.keySet();
		for(Integer roll : rollSet)
		{
			System.out.println("roll : " + roll + "::::: Name :" + names.get(roll) );
		}
		
		
		System.out.println("++++++++++++++Using  for each loop with Entry.Set ++++++++++++++++");
		
		Set <Map.Entry<Integer, String>> entrySet = names.entrySet();
		
		
		for(Map.Entry<Integer, String> entry : entrySet)
		{
			System.out.println("roll : " + entry.getKey() + "::::: Name :" + entry.getValue() );
		}
		
	
		System.out.println("++++++++++++++++ Using java 8 +++++++++++++++");
		names.forEach((k,v) -> {
			System.out.println("roll : " + k + "::::: Name :" +v);
		});
		
	}

}
