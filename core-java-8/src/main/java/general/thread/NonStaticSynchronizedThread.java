package general.thread;

public class NonStaticSynchronizedThread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setName("firstThread");
		
		Thread02 t2 = new Thread02();
		t2.setName("secondThread");
		
		Thread3 t3 = new Thread3();
		t3.setName("thirdThread");
		
		Thread t4  = new Thread4();
		t4.setName("fourth Thread");
		
		t1.start();
		t3.start();
		t4.start();
		t2.start();
		
		
	}

}

class PrintTable
{
	public synchronized static void printTable(int n)
	{
		System.out.println(Thread.currentThread().getName() + " - > synchronized static :: printTable()" );
		for(int i =0 ; i< 5 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " - >synchronized static  ::" + n*i);
			try {
				System.out.println(Thread.currentThread().getName() + " -> synchronized static :: Thread name :   Sleeping ..........");
				Thread.sleep(500);
			}
			catch(NullPointerException ne) {
				System.out.println("ne");
			}
			catch(InterruptedException ie) {
				System.out.println("ie");
			}			
		}
		System.out.println("End of ::" + Thread.currentThread().getName());
	}
	
	public static void hello()
	{
		System.out.println(Thread.currentThread().getName() + " - > Only Static ::" + "   hello()");
		System.out.println("Only Static :  End of ::" + Thread.currentThread().getName());
	}
	
	public static void printHi(int n)
	{
		System.out.println(Thread.currentThread().getName() + " - > Only Static : printHi() " );
		
		for(int i = 0; i< 5 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " - > Only Static  : " + n*i);
			
			try
			{
				System.out.println(Thread.currentThread().getName() + " -> Only Static :   Sleeping ...........");
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Only Static :  End of ::" + Thread.currentThread().getName());
	}
}


class Thread1 extends Thread
{
	public void run()
	{
		PrintTable.printTable(5); // synchronized static
		PrintTable.hello();   // static
	}
}

class Thread02 extends Thread
{
	public void run()
	{
		PrintTable.printTable(5);
	}
}

class Thread3 extends Thread
{
	public void run()
	{
		PrintTable.hello();
	}
	
}
class Thread4 extends Thread 
{
	public void run()
	{
		PrintTable.printHi(5);
	}
}
 