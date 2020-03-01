package algorithm;
// Adobe online test
// Given an array of characters. Find the 3rd and 4th position characters.
//e.g. {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'I', 'j', 'k', '1', '2', '3', '4', '5', '6','7','8','a','b','c','d','e','f','g','h'}
// 1st 3rd is 'c' , then 4th from here is 'g', then 3rd from here is 'j' so on
// o/p is cgj36be
public class FindSpecificCharacter{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		char [] ar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'I', 'j', 'k', '1', '2', '3', '4', '5', '6','7','8','a','b','c','d','e','f','g','h'};
		myPrint(ar, 27);
		

	}
	
	public static void   myPrint(char a[], int len)
	{
		
		int outC = 0;
		System.out.print(a[2]);
		outC++;
		
		
		for(int i = 2 ; i< len ; )
		{
			
			if(outC % 2 != 0)
			{
				i = i+4;
				if( i >= len-1)
				{
					break;
				}
				System.out.print(a[i]);
				outC++;
				continue;
			}
			if(outC % 2 == 0)
			{
				i = i+3;
				if( i >= len-1)
				{
					break;
				}
				System.out.print(a[i]);
				outC++;
			}
			
		}
	}

}



