package general;
//Write code to find a sub-string from the string.
public class SubStringFind {

	public static void main(String[] args) {

		subStringCal("We are Indian", "is");
	}
	
	public static void subStringCal(String mainStr, String requiredStr)
	{
		boolean existStr = mainStr.contains(requiredStr);
		System.out.println(existStr);
	}

}
