package general.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureThread01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<String> future = executor.submit(new MyCallableThread());
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executor.shutdownNow();

	}

}


class MyCallableThread  implements Callable<String>
{
	@Override
	public String call() throws Exception
	{
		return "hello";
	}
}