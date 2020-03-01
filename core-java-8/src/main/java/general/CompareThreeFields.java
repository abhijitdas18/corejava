package general;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// sort ArrayList contents w.r.t 3 member variables of Customer class
public class CompareThreeFields {

	public static void main(String[] args) {
		
		List<Customer> customers = Arrays.asList(
				new Customer("abhijit", "Guwahati", 34),
				new Customer("Pankaj", "Guwahati", 34),
				new Customer("Ravi", "Banglaore", 34),
				new Customer("Pranav", "Pune", 34),
				new Customer("Mithun", "Mumbai", 34),
				new Customer("Tutul", "Ajara", 34),
				new Customer("Raj", "Pune", 34),
				new Customer("abhijit", "Nalbari", 33),
				new Customer("Pankaj", "Silchar", 31),
				new Customer("Ravi", "Banglaore", 37),
				new Customer("Pranav", "Mumbai", 34),
				new Customer("Mithun", "Pune", 38),
				new Customer("Tutul", "Guwahati", 30),
				new Customer("Raj", "Pune", 34));
		
		//
		
		customers.stream().forEach(x->System.out.println(x));
		
		CustomerSortingComparator comparator = new CustomerSortingComparator();
		Collections.sort(customers, comparator);

	
		System.out.println("After Sorting .....");
		customers.stream().forEach(x->System.out.println(x));
	}

}

class CustomerSortingComparator implements Comparator<Customer>
{
	@Override
	public int compare(Customer cust1, Customer cust2)
	{
		int compareName = cust1.getName().compareTo(cust2.getName());
		int compareCity = cust1.getCity().compareTo(cust2.getCity());
		int comapareAge = Integer.valueOf(cust1.getAge()).compareTo(cust2.getAge());
		
		if(compareName  == 0)
		{
			return ((compareCity == 0)? comapareAge : compareCity);
		}
		else
		{
			return compareName;
		}
	}
	
}

class Customer {
	private String name;
	private String city;
	private int age;

	public Customer(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", age=" + age + "]";
	}

}
