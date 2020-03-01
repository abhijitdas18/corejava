package general;

public class ReturnType {

	public static void main(String[] args) {  // o/p aa
		
		System.out.println("aa");
		boolean b = true;
		if(b)
			return ;
		System.out.println("xx");
		

	}

}

interface AAA 
{
	void f();
}
class A111 implements AAA
{
	public void f()  // access modfied must 
	{
		
	}
}
