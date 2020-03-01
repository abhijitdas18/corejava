
package algorithm;

// Below example shows how to find out sum of each digit in the given number using recursion logic.
//For example, if the number is 259, then the sum should be 2+5+9 = 16.
public class SumOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num = "236";
		char[] ch = num.toCharArray();
		int first = 0;
		for (int i = 0; i <= num.length();) {
			if (i == 0) {
				first = Character.getNumericValue(ch[0]);
			}
			first = sumOfEachDigit(first, Character.getNumericValue(ch[i + 1]));
			i = i + 2;
		}
		System.out.println(first);
	}

	static int sumOfEachDigit(int fnum, int snum) {
		int first = fnum;
		int sec = snum;
		int res = first + sec;
		first = res;

		return first;

	}

}
