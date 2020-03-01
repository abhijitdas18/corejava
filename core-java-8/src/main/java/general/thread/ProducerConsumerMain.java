package general.thread;

import java.util.LinkedList;
import java.util.List;

//To make sure that the producer won’t try to add data into the buffer
//if it’s full and that the consumer won’t try to remove data from an empty buffer.
//Solution : The producer is to either go to sleep or discard data if the buffer is full. 
//The next time the consumer removes an item from the buffer, it notifies the producer, 
//who starts to fill the buffer again. In the same way, the consumer can go to sleep
//if it finds the buffer to be empty. The next time the producer puts data into the buffer,
//it wakes up the sleeping consumer.
public class ProducerConsumerMain {

	public static void main(String[] args) {

		ProducerConsumer pc = new ProducerConsumer();

		// create a producer thread
		Thread t1 = new Thread(new Runnable() {
			public void run() {

				pc.produce();
			}
		});

		// create a consumer thread
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				pc.consume();
			}
		});

		// start both the threads
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static class ProducerConsumer {
		// Create a list shared by producer and consumer
		// Size of list is 2.
		LinkedList<Integer> numbers = new LinkedList<>();
		int capacity = 2;
		int value = 0;

		// function called by producer thread
		public void produce() {
			System.out.println("Enter to produce......");
			while (true) {
				synchronized (this) {
					if (numbers.size() == capacity) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("Produce started ...." + value);
					numbers.add(value);
					value++;
					notify();

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}

		// function called by consumer thread
		public void consume() {
			System.out.println("Enter to consumer.......");
			while (true) {
				synchronized (this) {
					if (numbers.size() == 0) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("Consume started ......" + value);
					int val = numbers.removeFirst();
					System.out.println("consumed value :" + val);
					notify();

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}

}
