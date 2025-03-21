package OOPJ;
class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println(i+ " : "+Thread.currentThread().getName());
	}
		System.out.println(Thread.currentThread().getName()+" Sleeping...");
     try {
		Thread.sleep(1000);
     }catch(InterruptedException e) {
    	 e.printStackTrace();
    	 
     }
		System.out.println(Thread.currentThread().getName()+" Awaking and Workdone...");

	}
}
public class SleepDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Started");

		
		MyThread2 t1= new MyThread2();
		MyThread2 t2= new MyThread2();
		MyThread2 t3= new MyThread2();
		MyThread2 t4= new MyThread2();
		t1.start();
		
		System.out.println(Thread.currentThread().getName()+ "  finished");

		try {
			Thread.sleep(1000);
	     }catch(InterruptedException e) {
	    	 e.printStackTrace();
	    	 
	     }

	}

}
