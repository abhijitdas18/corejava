package general.thread;

public class CreateThread  extends Thread{
	
	public void run()
	{
		System.out.println("run is called................" + Thread.currentThread().getName());
		System.out.println("2 ::::" + currentThread().getState().toString());
		for(int i = 0; i <10 ; i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			wait(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2 .1::::" + currentThread().getState().toString());
	}

	public static void main(String[] args) {

		System.out.println("Main is called................");
		
		System.out.println("1 ::::" + currentThread().getState().toString());
		CreateThread thread1 = new CreateThread();
		thread1.setName("MyThread01");
		//thread1.run();
		thread1.start();
		System.out.println("3 ::::" + currentThread().getState().toString());
		System.out.println(" Inside Main is called................");
		//-------------------------------------------

		Runnable r = new Thread2();
		Thread t = new Thread(r);
		t.start();
		System.out.println("4 ::::" + currentThread().getState().toString());
	}

}

class Thread2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread2 is called................");
	}
}
