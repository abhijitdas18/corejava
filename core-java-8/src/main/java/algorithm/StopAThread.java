package algorithm;

public class StopAThread {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread, "A Thread");
		t1. start();
		
		System.out.println(Thread.currentThread().getName() + " is stopping...");
		myThread.stop();
		//myThread.interrupted();
		System.out.println(Thread.currentThread().getName() + " is stopped now...");

	}

}

class MyThread implements  Runnable 
{
	private boolean flag = false;
	
	public void run()
	{
		while(!flag)
		{
			System.out.println(Thread.currentThread().getName() + " is running now");
		}
		System.out.println(Thread.currentThread().getName() + " is stopped  now");
		
	}
	
	public void stop()
	{
		flag = true;
	}
}