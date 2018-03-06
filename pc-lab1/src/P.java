import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P extends Thread{
	
	public Thread thread; 
	public static final Lock mutex = new ReentrantLock(true);
	public void canProduce() throws InterruptedException
    {         

            if (Main.list.size()!=Main.capacity)
            {
            	  System.out.println("Produc " + Main.value);
                  Main.list.add(Main.value++);
                  
            }
            Thread.sleep(500);
        
    }
	
	public void run() {
		
		while(true)
		{
			try
			{
				mutex.lock();
				canProduce();
				
			} catch (Exception e) {

	            e.printStackTrace();
	        } 
			
			finally
			{
				mutex.unlock();
			}

		}
		
	}
}