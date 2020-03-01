package algorithm;
//Write a java program to find the largest number ‘L’ less than a given number ‘N’ which should not contain a given digit ‘D’. 
//For example, If 145 is the given number and 4 is the given digit, then you should find the largest number less than 145 
//such that it should not contain 4 in it. In this case, 139 will be the answer
//NOT DONE
public class LessThanANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lessThanANumber(145, 4);
	}

	private static void lessThanANumber(int number, int digit)
	{
		String strNo = null;
		for(int i = 0 ;i < number; i++)
		{
			System.out.println("Number : " + number);
			strNo = new Integer(number).toString();
			char [] arr = strNo.toCharArray();
			for(char ch : arr)
			{
				int reqNo = Character.getNumericValue(ch);
				System.out.println("No: " +reqNo);
				if(reqNo != digit)
				{
					System.out.println("Required no:" + reqNo);
					
				}
			}
			
		}
		
	}
}
