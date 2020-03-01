package general;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			//System.out.println("result ! :"+ scan.nextLine());
			System.out.println("result 2 :"+ scan.nextInt());
		}

	}

}
