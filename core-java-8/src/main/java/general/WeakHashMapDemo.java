package general;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		HashMap<Object, String> myMap = new HashMap<>();
		
		Test test = new Test();
		myMap.put(test, "aa");
		
		System.out.println(myMap);
		
		test = null;
		System.gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(myMap);
		
		WeakHashMap<Object, String> weakHashMap = new WeakHashMap<>();
		System.out.println(weakHashMap);
		test = new Test();
		weakHashMap.put(test, "pqr");
		
		System.out.println(weakHashMap);
		weakHashMap = null;
		
		System.out.println(weakHashMap);
		weakHashMap = new WeakHashMap<>();
		weakHashMap.put(test, "123");
		
		System.out.println(weakHashMap);
		weakHashMap = null;
		System.gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(weakHashMap);
		

				
		
		

	}

}

class Test
{
	public String toString(){
       return "TEST";
	}
	
	public void finalize()
	{
		System.out.println("Finalize is called");
	}
	
	
	
}
