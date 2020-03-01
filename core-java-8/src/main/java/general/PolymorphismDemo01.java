package general;

public class PolymorphismDemo01 {

	public static void main(String[] arg) {

		Base01 base = new Derived();
		base.func01();
		
		Derived der = new Derived();
		der.func02();
		
	}

}

class Base01 {
	public void func01() {
		System.out.println("func1- Base.");
	}

}

class Derived extends Base01 {

	@Override
	public void func01() {
		System.out.println("func1 - Derived.");

	}

	public void func02() {
		System.out.println("func2 - Derived.");
	}

}
