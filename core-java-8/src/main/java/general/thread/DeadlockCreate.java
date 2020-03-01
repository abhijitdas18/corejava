package general.thread;
//some issue in the code
public class DeadlockCreate {
	static String str1 = "ABC";
	static String str2 = "PQR";

	public static void main(String[] args) {

		MyDeadlock1 myDeadlock1 = new MyDeadlock1();
		Thread thread1 = new Thread(myDeadlock1);
		thread1.start();
		
		
		MyDeadlock2 myDeadlock2 = new MyDeadlock2();
		Thread thread2 = new Thread(myDeadlock2);
		thread2.start();
	}
	
	static class MyDeadlock1 implements Runnable
	{
		
		
		public void run()
		{
			int i =0;
			while(i<10)
			{
				synchronized(str1)
				{
					System.out.println("i : " + (i+1) + " Get lock on " + str1);
					synchronized(str2)
					{
						System.out.println("i : " + (i+1) + " Get lock on " + str2);
					}
				}
				i++;
				
			}
		}
		
		
	}
	
	static class MyDeadlock2 implements Runnable
	{
		
		
		public void run()
		{
			int i =0;
			while(i<10)
			{
				synchronized(str2)
				{
					System.out.println("Get lock on " + str1);
					synchronized(str1)
					{
						System.out.println("Get lock on " + str2);
					}
				}
				i++;
				
			}
		}
		
		
	}
	
	

}
