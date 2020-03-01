package general;

import java.io.IOException;

// == means You are doing reference comparison, not value comparison.
//When you use the == operator its checking to see if the references are equal, and they aren't. 
public class StringDemo {

	public static void main(String[] args) {

		// 1

		String s1 = "abc";
		String s2 = "abc";

		System.out.println("Start .....");
		System.out.println("s1  s2 is:::::1" + s1 == s2); // this is printing wrongly???
		System.out.println(s1 == s2);
		System.out.println("s1  s2 is:::::2" + s1 == s2);// this is printing wrongly???
		System.out.println("s1.equals(s2) :::::: " + s1.equals(s2));
		if(s1 == s2)
		{
			System.out.println("s1, s2 Strings are equal");
		}
		else
		{
			System.out.println("s1, s2 Strings are different");
		}
		
		// 1.1
		String localPrefix = "297"; //1
		String prefix = "297";      //2
		if (prefix == localPrefix)
		{
		    System.out.println("Strings are equal" );
		}
		else
		{
		    System.out.println("Strings are different");
		}

		// 2

		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		int a = end;
		System.out.println("a :" + a);
		System.out.println(s3.substring(start, end));

		// 3
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.println("X :" + x);

       //4
		int x1 = 10 * 10 - 10;

		System.out.println(x1);
		
		// 5
		try {
			throw new IOException("Hello");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		// 4

		boolean flag = false;
		try {
			if (flag) {
				while (true) {
				}
			} else {
				System.out.println("\nSystem.exit");
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}

	}

}
