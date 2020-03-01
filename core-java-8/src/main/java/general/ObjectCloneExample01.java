package general;

// it is legal for that method to make a field-for-field copy of instances of that class. 
public class ObjectCloneExample01{

	public static void main(String[] args) {

		Employee emp1 = new Employee("Abhi", 35, "India");
		Employee emp2 = null;
		
		try {
			emp2 = (Employee) emp1.clone();
			
			System.out.println("Emp1 :" + emp1);
			System.out.println("Emp2 : " + emp2);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		emp1.setAge(100);
		System.out.println();
		System.out.println("Emp1 :" + emp1);
		System.out.println("Emp2 : " + emp2);
	}
}

class Employee  implements Cloneable
{
	private String name;
	private int age;
	private String country;
	public Employee(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}
	public Employee() {
		super();
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
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
	
	
}
