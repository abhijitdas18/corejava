package general.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureThread {

	private static final int nThreads = 10;
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(nThreads);
		
		List<Future<Long>> list = new ArrayList<>();
		Callable<Long> worker = null;
		for(int i= 0; i<5; i++)
		{
			worker = new MyCallable();
			Future<Long> submit = executor.submit(worker);
			list.add(submit);
		}
		
		long sum = 0;
		
		System.out.println(list.size());
		for(Future<Long> future : list)
		{
			try
			{
				sum += sum + future.get();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
				
			}
			catch (ExecutionException ee)
			{
				ee.printStackTrace();
			}
		}
		
		System.out.println("Total : " + sum);
		
		executor.shutdown();
		
	}

}



//The Callable interface is similar to java.lang.Runnable, in that both are designed
//for classes whose instances are potentially executed by another thread. 
class MyCallable implements Callable<Long>
{	
	@Override
	public  Long call() 
	{
		System.out.println("Current tread : " + Thread.currentThread().getName());
		long sum = 0;
		for (long i =0; i<=10; i++)
		{
			sum += i;
		}
		return sum;
	}
	
	
}
