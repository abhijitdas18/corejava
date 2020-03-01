package algorithm;

//check prime number
public class SortNumber {

	public static void main(String args[]) {
		int a[] = { 2, 5, 3, 4, 6, 1 };
		sortingArray(a);
	}

	private static void sortingArray(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++) 
		{
			for (int j = 0; j < a.length - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("array is " + a[i]);

		}

	}

}
