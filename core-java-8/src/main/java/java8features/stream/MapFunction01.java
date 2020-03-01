package java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// convert lower case ot upper case
public class MapFunction01 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("abhi", "biju", "madu");
		
		//map(Funciton )
		List <String> nameUpper = names.stream().map(new MyFunctionToUpper()).collect(Collectors.toList());
		System.out.println("upper : " + nameUpper);
		
		//////////////////////////////
		names.stream().map(s -> s.toUpperCase()).forEach(x->System.out.println(x));
	}
	
	

}

class MyFunctionToUpper implements Function<String, String>
{
	@Override
	public String apply(String str)
	{
		return str.toUpperCase();
	}

	
}
