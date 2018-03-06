import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C extends Thread{

	
	public Thread thread;
	public static final Lock mutex = new ReentrantLock(true);
	public void canConsume() throws InterruptedException 
     {

             if(Main.list.size()!=0)
             {
            	 int val = Main.list.removeFirst();
                 System.out.println("Consum " + val);
                 
             }
             Thread.sleep(500);
  
            
         
     }
	 
	 public void run() {
			
			while(true)
			{
				try
				{
					mutex.lock();
					canConsume();
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
