package algorithm;

public class StaticMethodOverride {

	public static void main(String[] args) {

		SuperClass class1 = new BaseClass();
		class1.staticFunc();
		class1.nonStatic();
	}

}

class SuperClass
{
	void nonStatic()
	{
		System.out.println("This is SuperClass for nonStatic");
	}
	static void staticFunc()
	{
		System.out.println("this is static of SuperClass");
	}
}

class BaseClass extends SuperClass
{
	@Override
	void nonStatic()
	{
		System.out.println("this is BaseClass for nonStatic");
	}
	static void staticFunc()
	{
		System.out.println("this is static of BaseClass");
	}
}
