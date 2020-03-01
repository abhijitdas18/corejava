package general.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareableEx {

	public static void main(String[] args) 
	{

		Employee emp1 = new Employee("Yakub", 42);
		Employee emp2 = new Employee("Raju", 24);
		Employee emp3 = new Employee("Zeeshan", 40);
		Employee emp4 = new Employee("Madu", 34);
		
		List <Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		System.out.println("Display Employees : " + employees);
		
		Collections.sort(employees); // Employee extends Comparable
		
		System.out.println("Employees on sort :" + employees);
		
		
		// Sort using Comparator
		EmployeeAge empAge = new EmployeeAge();
		Collections.sort(employees, empAge);
		System.out.println("Employees sort on age : " + employees);
		
	}		

	
}


class EmployeeAge implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1 , Employee e2)
	{
		if(e1.getAge() > e2.getAge())
			return 1;
		else if( e1.getAge() < e2.getAge())
			return -1;
		return 0;
	}
}