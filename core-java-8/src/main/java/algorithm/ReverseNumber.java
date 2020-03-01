package algorithm;
// reverse a number - 12345 -> 54321
public class ReverseNumber {

	public static void main(String[] args) {
          System.out.println(reverseNumber(12345));
	}
	
	static int reverseNumber(int no)
	{
		int reverseNo = 0;
		while(no != 0)
		{
			reverseNo = (reverseNo*10) + ( no % 10);
			
			no = no /10;
		}
		
		return reverseNo;
	}

}
