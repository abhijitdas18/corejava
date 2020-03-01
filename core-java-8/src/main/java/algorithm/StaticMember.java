package algorithm;

public class StaticMember {
	String name;
	int roll ;
	static String course = "MCA";
	
	

	public StaticMember(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	
	public StaticMember(String name, int roll, String c) {
		this.name = name;
		this.roll = roll;
		this.course = c;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public static String getCourse() {
		return course;
	}


	public static void setCourse(String course) {
		StaticMember.course = course;
	}


	@Override
	public String toString() {
		return "StaticMember [name=" + name + ", roll=" + roll + ", Course= "+ course +" ]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMember s1 = new StaticMember("abhi", 100);
		StaticMember s2 = new StaticMember("raju", 30, "BAA");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		

	}

}
