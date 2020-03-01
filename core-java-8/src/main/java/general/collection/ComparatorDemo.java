package general.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	
	public static void main(String []ar)
	{
		ArrayList<Movie> list = new ArrayList<Movie>(); 
        list.add(new Movie("Force Awakens", 8.3f, 2015)); 
        list.add(new Movie("Star Wars", 8.7f, 1977)); 
        list.add(new Movie("Empire Strikes Back", 8.8f, 1980)); 
        list.add(new Movie("Return of the Jedi", 8.4f, 1983));
        
        Collections.sort(list);
        
        System.out.println("Movie on sort on year :" );
        for(Movie l : list)
        {
        	System.out.println(l.getName() + "::" + l.getYear() + ":::" + l.getRating());
        }
        System.out.println("-------------------------");
        System.out.println("Movie on sort on Rating :" );
        
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        
        for(Movie l : list)
        {
        	System.out.println(l.getName() + "::" + l.getYear() + ":::" + l.getRating());
        }
        System.out.println("-------------------------");
        System.out.println("Movie on sort on Name :" );
        
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        
        for(Movie l : list)
        {
        	System.out.println(l.getName() + "::" + l.getYear() + ":::" + l.getRating());
        }
        
	}

}


class RatingCompare implements Comparator<Movie>
{
	public RatingCompare() {
		System.out.println("RatingCompare constructor called_________________");
	}

	@Override
	public int compare(Movie o1, Movie o2) {
		System.out.println("RatingCompare comare ................");
		if(o1.getRating() > o2.getRating()) 
			return 1;
		else if(o1.getRating() < o2.getRating())
			return -1;
		else
		return 0;
	}
	
}

class NameCompare implements Comparator<Movie>
{
	
	public NameCompare() {
       System.out.println("NameCompare constructor called");  
	}

	@Override
	public int compare(Movie o1, Movie o2) {
		 System.out.println("NameCompare compare ...............");
		return o1.getName().compareTo(o2.getName());
	}
	
}
