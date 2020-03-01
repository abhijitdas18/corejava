package general;

class A2
{
	String a = "non static base";
	static String b = "static base";
	
	public void base()
	{
		System.out.println("This is base....");
	}
}

public class InhertienceEx  extends A2{

	String a = "non static derive";	
	static String b = "static derive";

	@Override
	public void base() {
		System.out.println("This is override  in derive....");
	}

	public static void main(String[] args) {

		A2 base01 = new InhertienceEx();
		System.out.println(base01.a); //  non static base
		base01.base(); //  This is override  in derive....
		
		System.out.println();
		
		System.out.println(base01.b);  //static base
		
		InhertienceEx derive01 = new InhertienceEx();
		System.out.println(derive01.a); // derive
		derive01.base(); // derive
		System.out.println(derive01.b);
		
		
	}

}



