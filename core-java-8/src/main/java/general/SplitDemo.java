package general;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";
		
		String[] s = str.split("1");

		System.out.println("len " + s.length);
		if (s != null) {
			for(int i =0; i<s.length; i++)
			{
				System.out.println(s[i] + " ---");
			}
		}
		System.out.println("========================");
		String[] s1 = str.split("6");

		System.out.println("len " + s1.length);
		if (s1 != null) {
			for(int i =0; i<s1.length; i++)
			{
				System.out.println(s1[i] + " ---");
			}
		}
		System.out.println("========================");
		String[] s2 = str.split("xyz");

		System.out.println("len " + s2.length);
		if (s2 != null) {
			for(int i =0; i<s2.length; i++)
			{
				System.out.println(s2[i] + " ---"); //123 ---
			}
		}

	}

}
