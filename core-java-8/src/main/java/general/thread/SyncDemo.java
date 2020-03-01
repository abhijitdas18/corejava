package general.thread;

class Counter {
	public int count;
	public void increament() throws InterruptedException {
		Thread.sleep(500);
		count++;
	}
}
public class SyncDemo  {

	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i<= 1000 ; i++) {
				  try {
					c.increament();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		});
		
        Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i<= 1000 ; i++) {
				  try {
					c.increament();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		});  
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count : " + c.count);
		
	}

}
