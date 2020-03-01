package general.thread;

public class SynchronousDemo2 {

	public static void main(String[] args) {

		Runnable r1 = new MyRunnableThread01();
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r1);
		t2.start();
	}

}


class PrintNumber
{
	static synchronized void show()
	{
		for(int i =1; i<=10; i++)
		{
			System.out.println(Thread.currentThread().getName() + " Display :" + i);
		}
	}
}

class MyRunnableThread01 implements Runnable
{
	public void run()
	{
		PrintNumber.show();
	}
}
