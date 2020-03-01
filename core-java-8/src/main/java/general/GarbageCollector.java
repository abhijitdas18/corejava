package general;

public class GarbageCollector {

	public static void main(String[] args) {
		GarbageCollector collector = new GarbageCollector();
		System.out.println("This is end of main");
	}
	
	protected void finalize()
	{
		System.out.println("finalized is called");
	}

}
