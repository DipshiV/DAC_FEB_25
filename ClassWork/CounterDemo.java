package OOPJ;
class Counter extends Thread{
	int count = 0;
	//ensure mutual exclusion
	synchronized void increment() {
		count++;
	}
}

public class CounterDemo {

	public static void main(String[] args)throws InterruptedException  {
		System.out.println(Thread.currentThread().getName()+" Started");

		Counter c1 = new Counter();
		Thread t1= new Thread(() -> {
			for(int i=0; i<1000; i++) {
				c1.increment();
				
			}
		}," T1");
	
		Thread t2= new Thread(() -> {
			for(int i=0; i<1000; i++) {
				c1.increment();
				
			}
		}," T2");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count = "+ c1.count);
		System.out.println(Thread.currentThread().getName()+" ended");

	}

}
