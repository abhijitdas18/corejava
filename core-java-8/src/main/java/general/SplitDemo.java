package general;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";
		
		String[] s = str.split("or");

		if (s != null) {
			for(int i =0; i<s.length; i++)
			{
				System.out.println(s[i] + " ---");
			}
		}

	}

}
