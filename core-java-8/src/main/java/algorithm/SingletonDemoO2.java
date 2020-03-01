package algorithm;
// Eager instantiation
//Constructor.
//Obj1 : algorithm.MySingleTon@15db9742
//Obj2 : algorithm.MySingleTon@15db9742
public class SingletonDemoO2 {

	public static void main(String[] args) {

		MySingleTon02 obj1 = MySingleTon02.getInstance();
		System.out.println("Obj1 : " + obj1);
		
		MySingleTon02 obj2 = MySingleTon02.getInstance();
		System.out.println("Obj2 : " + obj2);
	} 
	
	

}

class MySingleTon02 
{
	private static MySingleTon02 mySingleTon = new MySingleTon02();
	
	private MySingleTon02()
	{
		System.out.println("Constructor.");
	}
	public static MySingleTon02 getInstance()
	{
		return mySingleTon;
	}
	
}
