package general.sampleone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// calculate the total salary and id
public class PersonMain {

	public static void main(String[] args) {

		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(new Person(101, "abhijit",2000));
		listPerson.add(new Person(102, "Raju",1000));
		listPerson.add(new Person(103, "Madhu",4000));
		listPerson.add(new Person(104, "Tapash",3000));
		
		int totalSalary = listPerson.stream().collect(Collectors.summingInt(Person:: getSalary));
		System.out.println("Total salary : " + totalSalary);
	}

}
