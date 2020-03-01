package algorithm;
// for a given number find the last digit and the remaining number.
// eg., for number 2314, the last digit is 4 and remaining number is 231
public class FindLastDigit {

	public static void main(String[] args) {

		findLastDigit(2314);
	}
	
	static void findLastDigit(int number)
	{
		int lastDigit = number % 10;
		System.out.println("Last digit :" + lastDigit);
		
		System.out.println();
		
		int remainingNumber = number / 10;
		System.out.println("Remaining number : " + remainingNumber);
	}

}
