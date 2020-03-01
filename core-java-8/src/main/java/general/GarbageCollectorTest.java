package general;

public class GarbageCollectorTest {

	
	String objName;
	
	GarbageCollectorTest t1  = null;
	
	public GarbageCollectorTest(String obj)
	{
	   this.objName = obj;
	   System.out.println("Constructor : Created object :-" + obj);
	}
	public static void main(String[] args) {

		GarbageCollectorTest obj1 = new GarbageCollectorTest("Object1");
		obj1.show();
		
		System.gc();
		
		
	}
	
	private void display()
	{
		t1 = new GarbageCollectorTest("T1");
		
		//object t5 inside method becomes unreachable when show() removed 
		GarbageCollectorTest t5 = new GarbageCollectorTest("T5"); //
	}
	
	private void show()
	{
		//object t2 inside method becomes unreachable when show() removed 
		GarbageCollectorTest t2 = new GarbageCollectorTest("T2");
		display();
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(this.objName + " is called for GC");
	}
	
	

}
