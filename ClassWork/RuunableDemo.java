package OOPJ;
class MyRunable implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}

public class RuunableDemo {

	public static void main(String[] args) {
		
//MyRunable r1 = new MyRunable();
//Thread t1 = new Thread(r1,"T1");
//t1.start();
//Thread t2 = new Thread(r1,"T2");
//t2.start();
//Thread t3 = new Thread(r1,"T3");
//t3.start();
		 Runnable r1= () -> {
			System.out.println("Lambda expression are working");
		};
	
	Thread t1= new Thread(r1);
	t1.start();

}
}
