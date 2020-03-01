package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class SortHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hset = new HashSet<>();
		hset.add("abc");
		hset.add("lmn");
		hset.add("pqr");
		hset.add("cde");
		hset.add("efg");
		
		sortHashSet(hset);
	}
	static void sortHashSet(HashSet<String> hset)
	{
		
		/////////////////// 1 //////////////////////
		// unsorted and not in insertion order
		System.out.println("Given set : " + hset);
		
		ArrayList<String> list = new ArrayList<>(hset);
		System.out.println("Converted to List : "+ list);
		
		//	sorting the hashset using list
		Collections.sort(list);
		System.out.println("sorting with Collection:" + list);
		
		///////////////////////////// 2 /////////////////////
		
		
		ArrayList<String> list0 = new ArrayList<>(hset);
		System.out.println("Orginal List : "+ list0);
		Comparator c = new Comparator<String>() {
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		};
		Collections.sort(list0, c);
		System.out.println("Sorting with comaparator : " + list0);
		
		/////////////////////////////// 3 /////////////////////////////
		
		
		ArrayList<String> list002 = new ArrayList<>(hset);
		System.out.println("list002 : " + list002);
		
		Comparator <String>c0 = (s1, s2) -> s1.compareTo(s2);
		Collections.sort(list002, c0);
		System.out.println("Using comparator and lambda expr:" + list002);
		/////////////////////////////// 4 ///////////////////////////
		
		ArrayList<String> list1 = new ArrayList<>(hset);
		System.out.println("On orifinal list : "+ list1);
		
		// sorting using Treeset
		TreeSet<String> tset = new TreeSet<>(list1);
		System.out.println("sort with treeset : " + tset);
		
		
		///////////////////////////// 5 ///////////////////////////
		// Using sort() of List as java 8
		ArrayList<String> list003 = new ArrayList<>(hset);
		list003.sort(new Comparator<String> () {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		System.out.println("sorting :::::" + list003);
		
		
	}

}
