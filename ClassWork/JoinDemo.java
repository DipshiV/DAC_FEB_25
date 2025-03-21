package OOPJ;
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println(i+ " : "+Thread.currentThread().getName());
	}
}
}
public class JoinDemo  {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Started");
		MyThread1 t1 = new MyThread1();t1.setName("T1");
		
		
		MyThread1 t2= new MyThread1();t2.setName("T2");
		
		MyThread1 t3 = new MyThread1();t3.setName("T3");
		
		t1.start();
		t2.start();
		try {
		t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t3.start();
		System.out.println(Thread.currentThread().getName()+ "  finished");

		
	}

}
