package general.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadExecutorEx01 {

	static final int MAX_T = 3;
	public static void main(String[] args) {

		Runnable r1 = new Task("Task-1");
		Runnable r2 = new Task("Task-2");
		Runnable r3 = new Task("Task-3");
		Runnable r4 = new Task("Task-4");
		Runnable r5 = new Task("Task-5");
		
		// creates a thread pool with MAX_T no. of  
        // threads
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(MAX_T);
		
		// passes the Task objects to the pool to execute
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		
		pool.shutdown();
		
		//pool.execute(r1);
		
		
	}

}

class Task implements Runnable
{
	
	private String name;
	
	public Task(String name)
	{
		this.name = name;
	}

	
	// Prints task name and sleeps for 1s 
    // This Whole process is repeated 5 times 
	@Override
	public void run()
	{
		try
		{
			 for (int i = 0; i<=5; i++) 
	            { 
	                if (i==0) 
	                { 
	                    Date d = new Date(); 
	                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
	                    System.out.println("Initialization Time for"
	                            + " task name - "+ name +" = " +ft.format(d));    
	                    //prints the initialization time for every task  
	                } 
	                else
	                { 
	                    Date d = new Date(); 
	                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
	                    System.out.println("Executing Time for task name - "+ 
	                            name +" = " +ft.format(d));    
	                    // prints the execution time for every task  
	                } 
	                Thread.sleep(1000); 
	            } 
	            System.out.println(name+" complete"); 
			
		}
		catch(InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
		
	}
}
