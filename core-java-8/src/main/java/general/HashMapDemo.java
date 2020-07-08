package general;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("a", 123);
		map.put("b", 456);
		System.out.println("Map 1 : "+  map ); // [123, 456]
		
		map.put("a", 678);
		
		System.out.println(map); // [678, 456]
		
		// Associates the specified value with the specified key in this map.
		// If the map previously contained a mapping for the key, the old value is replaced.
		// put() return the previous value associated with key, or null if there was no mapping for key.
		// (A null return can also indicate that the map previously associated null with key.)
		System.out.println("Return of put() ::"+ map.put("a", 123)); // print 678, as this value was already associated with "a"
		System.out.println(map); // [123, 456]
		
		System.out.println(map.put("c", 4567));  // null as no value was associated with "c"  
		System.out.println(map); // [123, 456, 4567]
		
		int a = map.put("a", 123);
		int b =  map.put("b", 1230);
		int c =  map.put("a", 1234);
		
		System.out.println(a + ":"+ b + ":" + c);  // 123, 1230, 123
		
	}

}
