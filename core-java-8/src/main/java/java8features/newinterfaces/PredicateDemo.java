package java8features.newinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Predicate object receives one value and returns true or false.
public class PredicateDemo {

	public static void main(String[] args) 
	{
		
		Predicate <Integer> positivePredicate = i -> i > 0;
		
		
		
		List <Integer> 	nos = Arrays.asList(new Integer(1),new Integer(10),
                new Integer(200),new Integer(101), 
                new Integer(-10),new Integer(0));
		
		nos.forEach(x -> System.out.print(x + " " ) );
		
		System.out.println();
		System.out.println("Positive :");
		System.out.println(filterNos(nos, positivePredicate));
		
		System.out.println("Negative :");
		Predicate <Integer> negativePredicate = pre -> pre <0;
		List<Integer> filterNo = filterNos(nos, negativePredicate);
		filterNo.forEach(n -> System.out.print(n + " "));	
		
;
		
	}
	
	public static List<Integer> filterNos(List<Integer> nos, Predicate<Integer> myPredicate)
	{
		List<Integer> filterNos = new ArrayList<Integer>();
		
		for(Integer no : nos)
		{
			boolean predicateValue = myPredicate.test(no);
			if(predicateValue)
			{
				filterNos.add(no);
			}
		}
		return filterNos;
	}
}
