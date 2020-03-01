package general;
// variables in Java do not follow polymorphism and
// overriding is only applicable to methods, not variables.
//  instance variable is chosen from the reference type.
// the Child class's variable hides the parent's variable, even if their types are different.
// And this concept is known as variable hiding.
class Base0001
{
	String var = "Parent variable";
}

class Derived0001 extends Base0001
{
	String var = "Derived variable";

	String newVar = "Derived newVar";
}


public class InstanceVariableOverride {

	public static void main(String[] args) {

		Base0001 base = new Derived0001();
		System.out.println(base.var);
		
		System.out.println();
		
		//System.out.println(base.newVar);

	}

}
