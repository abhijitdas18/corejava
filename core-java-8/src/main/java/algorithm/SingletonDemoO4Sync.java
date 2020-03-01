package algorithm;
//“Double Checked Locking” 
//We have declared the obj volatile which ensures that multiple threads offer
//the obj variable correctly when it is being initialized to Singleton instance. 
//This method drastically reduces the overhead of calling the synchronized method every time.
public class SingletonDemoO4Sync {

	public static void main(String[] args) {

		MySingleTon04 obj1 = MySingleTon04.getInstance();
		System.out.println("Obj1 : " + obj1);
		
		MySingleTon04 obj2 = MySingleTon04.getInstance();
		System.out.println("Obj2 : " + obj2);
	}

}

class MySingleTon04
{
	private static volatile MySingleTon04 singleTon04;
	
	private MySingleTon04()
	{
		System.out.println("Constructor.");
	}
	
	public static MySingleTon04 getInstance()
	{
		if(singleTon04 == null) {
			
			//To Make Thread safe
			synchronized(MySingleTon04.class)
			{
				// check again as multiple thread can reach above step
				if(singleTon04 == null)
				{
					singleTon04 = new MySingleTon04();
				}
			}
		}
		return singleTon04;
	}
}
