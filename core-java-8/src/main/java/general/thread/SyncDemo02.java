package general.thread;


//Java program to illustrate 
//Object lock concept 
class SyncDemo02 implements Runnable { 
	
	int count;
	
	public void run() 
	{ 
		Lock(); 
	} 
	public void Lock1() 
	{
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			count++;
			System.out.println("in Sync block " + Thread.currentThread().getName() + " Count : " + count);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("in Sync block " + Thread.currentThread().getName() + " end");
		}
	} 
	
	
	public  synchronized void  Lock() 
	{
		System.out.println(Thread.currentThread().getName());

		count++;
		System.out.println("in Sync block " + Thread.currentThread().getName() + " Count : " + count);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("in Sync block " + Thread.currentThread().getName() + " end");

	} 

//	public static void main(String[] args) 
//	{ 
//		SyncDemo02 g = new SyncDemo02(); 
//		Thread t1 = new Thread(g); 
//		Thread t2 = new Thread(g); 
//		//SyncDemo02 g1 = new SyncDemo02(); 
//		Thread t3 = new Thread(g); 
//		Thread t4 = new Thread(g);
//		t1.setName("t1"); 
//		t2.setName("t2"); 
//		t3.setName("t3"); 
//		t4.setName("t4"); 
//		t1.start(); 
//		t2.start(); 
//		t3.start();
//		t4.start();
//	} 
	public static void main(String[] args) 
	{ 
		SyncDemo02 g = new SyncDemo02(); 
		Thread t1 = new Thread(g); 
		Thread t2 = new Thread(g); 
		SyncDemo02 g1 = new SyncDemo02(); 
		Thread t3 = new Thread(g1); 
		Thread t4 = new Thread(g1);
		
		SyncDemo02 g2 = new SyncDemo02(); 
		Thread t5 = new Thread(g2); 
		Thread t6 = new Thread(g2);
		
		t1.setName("t1"); 
		t2.setName("t2"); 
		t3.setName("t3"); 
		t4.setName("t4"); 
		
		t5.setName("t5"); 
		t6.setName("t6"); 
		
		t1.start(); 
		t2.start(); 
		t3.start();
		t4.start();
		
		t5.start();
		t6.start();
	} 
} 

