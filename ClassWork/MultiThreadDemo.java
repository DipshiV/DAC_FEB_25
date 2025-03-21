package OOPJ;

class MyThread extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(i+" : "+Thread.currentThread().getName());
	}
}
}
	public class MultiThreadDemo {
	public static void main(String[] args) {
MyThread t1 =  new MyThread();
t1.setName("T1");
Thread t2 =  new MyThread();
t2.setName("T2");
Thread t3 =  new MyThread();
t3.setName("T3");

t1.start();
t2.start();
t3.start();
	}

}
