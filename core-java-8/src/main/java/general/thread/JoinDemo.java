package general.thread;

class MyThread extends Thread
{
	
	public void run()
	{
		for(int i =0 ; i<2 ; i++)
		{
			try {
				Thread.sleep(300);
				System.out.println("Current Thread : " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("value : " + i);
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.setName("T1");
		MyThread t2 = new MyThread();
		t2.setName("T2");
		MyThread t3 = new MyThread();
		t3.setName("T3");
		
		t1.start();
		System.out.println("Current Thread in main1 : " + Thread.currentThread().getName());
		t1.join();
		
		t2.start();
		System.out.println("Current Thread in main2 : " + Thread.currentThread().getName());
		t2.join();
		
		t3.start();
		
		

	}

}
