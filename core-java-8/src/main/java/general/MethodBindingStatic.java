package general;

/* Java program to show that if static method is redefined by 
a derived class, then it is not overriding,it is hiding */

class Base
{
	 // Static method in base class which will be hidden in subclass  
	static void funcStatic()
	{
		System.out.println("Base static Method ...");
	}
	
	// Non-static method which will be overridden in derived class  
	void funcNonStatic()
	{
		System.out.println("Base Non static method....");
	}
}


public class MethodBindingStatic extends Base{

	
	// This method overrides funcNonStatic() in Parent  
	@Override
	void funcNonStatic() {
		System.out.println("child non static .....");
	}
	
	// Can not override static method
	//void funcStatic()	{ 	}
	
	// This method hides funcStatic() in Parent 
	static void funcStatic()
	{
		System.out.println("Child static method....");
		
	}

	public static void main(String[] args) {

		Base base = new Base();
		base.funcNonStatic();  // Base Non static method....
		base.funcStatic();  // Base static Method ...
		

        // As per overriding rules this should call to class Child static  
        // overridden method. Since static method can not be overridden, it  
        // calls Parent's funcStatic()
		Base base01 = new MethodBindingStatic();
		base01.funcStatic();// Base static Method ...
		base01.funcNonStatic(); // child non static .....
	}

}
