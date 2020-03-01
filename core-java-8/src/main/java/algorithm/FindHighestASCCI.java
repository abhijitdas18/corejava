package algorithm;

// find the highest ascii in array
public class FindHighestASCCI {

	public static void main(String[] args) {

		char[] ch = { 'a', 'A', 'z', 'e', 'L', 'w' };
		findHightestASCII(ch);
	}

	static void findHightestASCII(char[] ch) {
		int highest = (int) ch[0];
		char chHighest = ch[0];
		{
			for (char c : ch) {
				System.out.print((int) c + ",");
				if ((int) c > highest) {
					highest = (int) c;
					chHighest = c;

				}
			}
			System.out.println();

			System.out.println("Char : " + chHighest + ", ASCII : " + highest);
		}
	}

}
