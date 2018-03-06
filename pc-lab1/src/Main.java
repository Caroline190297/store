import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;


public class Main
{
	public static int capacity = 16;
	
	static Semaphore semFull = new Semaphore(0);
	static Semaphore semFree= new Semaphore(capacity);
	public static LinkedList<Integer> list = new LinkedList<>();
    public static int value = 1;
	
 public static void main(String[] args) throws InterruptedException
 {
	 
	 
	    C consumer = new C();
	    P producer = new P();
		
		producer.start();
		consumer.start();
		
		producer.join();
		consumer.join();
		
     /*
     final P p = new P();
     final C c = new C();

     Thread t1 = new Thread(new Runnable()
     {
         @Override
         public void run()
         {
             try
             {
                 while (true) {
                     p.produce();   
                 }                 
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
             }
         }
     });

     Thread t2 = new Thread(new Runnable()
     {
         @Override
         public void run()
         {
             try
             {
                 while (true) {
                     c.consume();   
                 }
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
             }
         }
     });

     t1.start();
     t2.start();

     // t1 finishes before t2
     t1.join();
     t2.join();
     */
 }
}