package general;

import java.util.Arrays;

// Delhi is capital of India. What is your name? What a beautiful!
// Part the sentence based on the special characters
public class SpringSplit {

	public static void main(String[] args) {
		String str = "Delhi is capital of India. What is your name? What a beautiful!";
		String regularExpr = "\\.|\\?|\\!";
		stringOperation(str,  regularExpr);

	}
	
	public static void stringOperation(String sentence, String regx) {
		String [] result = sentence.split(regx);
		System.out.println(Arrays.toString(result));
		for (String s : result)
		{
			System.out.println(s);
		}
	}

}
