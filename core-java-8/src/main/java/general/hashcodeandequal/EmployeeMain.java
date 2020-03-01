package general.hashcodeandequal;

import java.util.HashSet;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {

		Set <Employee> emp = new HashSet<>();
		
		Employee e1 = new Employee(1, "Abhijit");
		Employee e2 = new Employee(2, "Raju");
		Employee e3 = new Employee(1, "Abhijit");
		Employee e4 = new Employee(3, "Abhijit");		
		Employee e5 = new Employee(4, "Abhijit");
		Employee e6 = new Employee(2, "Raju");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		System.out.println("Emp ::::" + emp);
		
		Set <Integer> h = new HashSet<>();
		h.add(1);
		h.add(10);
		h.add(10);
		h.add(1);	
	
		
		System.out.println("h: " + h);
		
	}
	

}
