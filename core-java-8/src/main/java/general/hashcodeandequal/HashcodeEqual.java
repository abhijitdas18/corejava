package general.hashcodeandequal;

import java.util.HashSet;

public class HashcodeEqual {

	public static void main(String[] args) 
	{
		Employee01 em1 = new Employee01("Abhi", 101);
		Employee01 em2 = new Employee01("Abhi", 102);
		Employee01 em3 = new Employee01("Abhi1", 101);
		Employee01 em4 = new Employee01("Abhi", 101);
		Employee01 em5 = new Employee01("Abhi", 101);
		
		HashSet<Employee01> emp = new HashSet<>();
		emp.add(em1);
		emp.add(em2);
		emp.add(em3);
		emp.add(em4);
		emp.add(em5);
		
		System.out.println("Size : " + emp.size());
		System.out.println("Values :" + emp);
		

	}

}


class Employee01
{
	String name;
	int age;
	public Employee01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee01 [name=" + name + ", age=" + age + "]";
	}
	
	
	public int hashCode()
	{
		System.out.println("In hashCode____________ ");
		int calulateHashCode = 0;
		
		calulateHashCode = 20 * age;
		calulateHashCode += name.hashCode();
		System.out.println("age and name ::" + age + "::"+ name + "   hashCode  :::"+ calulateHashCode);
		return calulateHashCode;
	}
	
	public boolean equals(Object obj)
	{
		boolean equalRes = false;
		System.out.println("In equals________________");
		if(obj instanceof Employee01)
		{
			Employee01 emp = (Employee01)obj;
			if(emp.name.equals(this.name) && emp.age == this.age)
			{
				equalRes = true;
			}
			else
			{
				equalRes = false;
			}
		}
		else
		{
			equalRes = false;
		}
		System.out.println("age and name ::" + age +"::"+ name + "::" + equalRes);
		return equalRes;
		
	}
	
}