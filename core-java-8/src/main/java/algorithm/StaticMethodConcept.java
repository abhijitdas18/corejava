package algorithm;

public class StaticMethodConcept{

	
	public static void main(String[] args) {

		A1 a1 = new A1();
		A1 a2 = new A1();
		A1 a3 = new A1();
		
		B1 b1 = new B1();
		B1 b2 = new B1();
		B1 b3 = new B1();
		
	}

}


class A1
{
	
	 int counterA = 0; // individual copy of each object
	 
	 A1()
	 {
		 counterA++;
		 System.out.println("A : " + counterA);
	 }
}

class B1
{
	static int counterB = 0; // single copy of each object
	
	B1()
	{
		counterB++;
		System.out.println("B: "+ counterB);
	}
	
}
