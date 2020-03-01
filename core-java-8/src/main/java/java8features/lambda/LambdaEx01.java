package java8features.lambda;

import java.util.Arrays;

public class LambdaEx01 {
	
	String coma01 = ",";

	public static void main(String[] args) {

		Arrays.asList("a","b","c").forEach(str -> System.out.println(str));
		
		String coma = ",";
		Arrays.asList("a","b","c").forEach(
				str -> System.out.println(str + coma)
				);	
		
	}

}
