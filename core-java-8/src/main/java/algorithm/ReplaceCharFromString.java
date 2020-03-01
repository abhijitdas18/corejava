package algorithm;
// enter a string. Replace the character 't' with no. of ocuurence of it.
// e.g. input abctpqrtlmnt -> abc1pqr2lmn3

// Program in not completed
import java.util.Scanner;

public class ReplaceCharFromString {

	public static void main(String[] args) {
		
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("Input values is ::::" + str);
        int counter = 1;
        for ( int i = 0 ;i< str.length(); i++)
        {
            System.out.println("str.charAt(i) :" + str.charAt(i));
            if(str.charAt(i) == 't')
            {
                System.out.println("counter : " + counter);
               System.out.println("(char)(i + '0') :" + (char)(counter+ '0'));
                str = str.replace(str.charAt(i)  , (char)(counter + '0'));
                counter++;
            }
        }
        System.out.println(str);
	}

}
