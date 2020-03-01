package algorithm;

public class SingletonDemoO3Sync {

	public static void main(String[] args) {
		
		MySingleTon03 obj1 = MySingleTon03.getInstance();
		System.out.println("Obj1 : " + obj1);
		
		MySingleTon03 obj2 = MySingleTon03.getInstance();
		System.out.println("Obj2 : " + obj2);

	}

}

class MySingleTon03
{
	private static MySingleTon03 mySingleTon = null;
	
	private MySingleTon03()
	{
		System.out.println("Constructor.");
	}
	
	public synchronized static MySingleTon03 getInstance()
	{
		if(mySingleTon == null)
		{
			mySingleTon = new MySingleTon03();
		}
		return mySingleTon;
	}
}
