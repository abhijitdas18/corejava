package general;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		  Country indiaCountry=new Country("India");
		  Country chinaCountry=new Country("China");
		  Country nepalCountry=new Country("Nepal");
		  Country bhutanCountry=new Country("Bhutan");
		  Country indiaCountry2=new Country("India");
		  Country nepalCountry2=new Country("Nepal");
		 
		  TreeSet countryTreeSet = new TreeSet();
		  countryTreeSet.add(indiaCountry);
		  countryTreeSet.add(chinaCountry);
		  countryTreeSet.add(nepalCountry);
		  countryTreeSet.add(bhutanCountry);
		  countryTreeSet.add(indiaCountry2);
		  countryTreeSet.add(nepalCountry2);
		  
		 
		  Iterator counIter=countryTreeSet.iterator(); // put debug point here
		  while(counIter.hasNext())
		  {
			  System.out.println(counIter.next());
		  }
//		  while(counIter.hasNext())
//		  {
//		   System.out.println(counIter.next().);
//		  }

	}

}

class Country implements Comparable<Country>
{
	String name;
	
	

	public Country(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public String toString() {
		return "Country [name=" + name + "]";
	}

	@Override
	public int compareTo(Country o) {
		// TODO Auto-generated method stub
		return (this.name.compareTo(o.name));
	}
	
	
	
	
}
