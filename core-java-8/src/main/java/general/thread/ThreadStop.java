package general.thread;

class MyThread01 extends Thread {
	// Initially setting the flag as true

	private volatile boolean flag = true;

	// This method will set flag as false

	public void stopRunning() {
		flag = false;
	}

	@Override
	public void run() {
		// Keep the task in while loop

		// This will make thread continue to run until flag becomes false

		while (flag) {
			System.out.println("I am running....");
		}

		System.out.println("Stopped Running....");
	}
}

public class ThreadStop {
	public static void main(String[] args) {
		MyThread01 thread = new MyThread01();

		thread.start();

		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// call stopRunning() method whenever you want to stop a thread

		thread.stopRunning();
		thread.interrupt();
	}
}