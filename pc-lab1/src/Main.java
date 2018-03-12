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

 }
}