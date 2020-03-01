package general;

import java.util.Date;

public class ImmutableClassMain {

	public static void main(String[] args) {

		ImmutableClass immutableClass = ImmutableClass.getInstance(123, "Hello", new Date());
		System.out.println(immutableClass);
		
		
		
		
		
		
	}

}
