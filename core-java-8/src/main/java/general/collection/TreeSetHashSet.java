package general.collection;

import java.util.*;


public class TreeSetHashSet  {

	public static void main(String[] args) {
		TreeSet<Test1> t = new TreeSet<Test1>();

		// Custom class Test1 implements Comperable and compareTo return 0 always
		// All the elements are equal
		t.add(new Test1(10));
		t.add(new Test1(20));
		t.add(new Test1(1));
		System.out.println("Size of t :"  + t.size());  //  1
		
		for(Test1 obj : t)
		{
			System.out.println(obj.getA());   // 10
		}	
		
		
		////////////////////////// TREESET ////////////////
		
		TreeSet<String> names = new TreeSet<>();
		names.add("abc");
		names.add("pqr");
		names.add("lmn");
		names.add("1mn");
		names.add("lmn");
		System.out.println("::::::::::::::::::::::::::");
		System.out.println("Size :" + names.size());   // 4
		
		for(String s : names)
		{
			System.out.println(s);
		}
		System.out.println("::::::::::::::::::::::::::");	
		
		//////////////////////HASHSET/////////////////////
		HashSet<String> names1 = new HashSet<>();
		names1.add("abc");
		names1.add("pqr");
		names1.add("lmn");
		names1.add("1mn");
		names1.add("lmn");
		
		System.out.println("Size: " + names1.size());
		System.out.println("::::::::::::::::::::::::::");	
		for(String s : names1)
		{
			System.out.println(s);
		}	
    }
}


class Test1 implements Comparable<Test1>{
	int a ;
	
	Test1(int a) {
      this.a = a;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	// always return 0
	public int compareTo(Test1 t)
	{
		return 0;
	}
	
}
