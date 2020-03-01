package general.thread;
// Print 10 numbers secuentially using two threads 

public class PrintNumberInThread {

	boolean odd;
	int count = 1;
	int MAX = 10;

	public void printOdd() {
		System.out.println(Thread.currentThread().getName() + " : printOdd called...");
		synchronized (this) {
			while (count < MAX) {
				System.out.println(Thread.currentThread().getName() +" : Checking ODD loop : odd :" + odd);

				while (!odd) {
					try {
						System.out.println(Thread.currentThread().getName() +" : Odd waiting : " + count);
						wait();
						System.out.println(Thread.currentThread().getName() +" : Notified odd :" + count);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() +" : Odd Thread print:----------------------" + count);
				count++;
				odd = false;
				notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	public void printEven() {
		System.out.println(Thread.currentThread().getName() + ": printEvent called...");

		synchronized (this) {
			while (count < MAX) {
				System.out.println(Thread.currentThread().getName() + " : Checking EVEN loop: odd :" + odd);

				while (odd) {
					try {
						System.out.println(Thread.currentThread().getName() +" : Even waiting: " + count);
						wait();
						System.out.println(Thread.currentThread().getName() +" :Notified even:" + count);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() +" :Even thread print:-------------------------" + count);
				count++;
				odd = true;
				notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}

		}

	}

	public static void main(String[] ar) {
		PrintNumberInThread oep = new PrintNumberInThread();
		oep.odd = true;
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				oep.printEven();

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				oep.printOdd();

			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
