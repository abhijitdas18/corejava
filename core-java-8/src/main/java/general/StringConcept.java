package general;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = s2;
		
		System.out.println(s1== s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s3== s2);
		System.out.println(s3.equals(s2));
		
	}
	
	

}
