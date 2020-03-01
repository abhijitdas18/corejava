package general.thread;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySynThread b = new MySynThread();
		b.start();
//		System.out.println(b.total);
		
		synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
            }catch(Exception e){
                e.printStackTrace();
            }
 
            System.out.println("Total is: " + b.total);
        }

	}

}

class MySynThread extends Thread {
	int total;

	public void run() {
		sum();
	}
	public void sum()
	{
		synchronized(this){
            for(int i=0; i<10 ; i++){
                total += i;
            }
            notify();
        }
	}
}
