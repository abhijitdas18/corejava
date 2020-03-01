package general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FailFastExample {

	public static void main(String[] args) {

		HashMap<String,String> cityCap = new HashMap<>();
		cityCap.put("Delhi", "India");
		cityCap.put("WA", "USA");
		cityCap.put("london", "England");
		
		Set<String> city = cityCap.keySet();
		Iterator<String> itr = city.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			cityCap.put("aaa", "XXXXX");  //ConcurrentModificationException
		}
	}

}
