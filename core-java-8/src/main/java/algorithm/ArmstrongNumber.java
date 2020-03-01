package algorithm;

//A number is called an Armstrong number if it is equal to sum of its digits each raised 
//to the power of number of digits in it. For example: 153, 371, 407, 9474, 54748 are some Armstrong numbers.
//153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(getPower(5, 3));
		checkArmstrongNum(153);
		Object ob = new Object();

	}

	static void checkArmstrongNum(int number) {
		int result = 0;
		int temp = number;
		int originalNo = number;
		int noOfDigits = Integer.valueOf(number).toString().length();
		while (temp !=0) {
			
			// get the last digit
			int lastNumber = number % 10;
			
			temp = temp / 10;
			number = temp;
			result = result + getPower(lastNumber, noOfDigits);
			System.out.println("REsult ::::" + result);
		}
		System.out.println("REsult :" +result);
		System.out.println("originalNo :"+ originalNo);
		if( originalNo == result)
		{
			System.out.println("This is amstorng number");
		}
		else
		{
			System.out.println("This is not amstorng number");
		}

	}

	static int getPower(int num, int index) {
		int result = num;
		int originalNum = num;
		for (int i = 1; i < index; i++) {
			result = result * originalNum;
		}
		return result;
	}

}
