package OOPJ;
class AddRunnable implements Runnable{
	@Override
	public void run() {
			System.out.println(Thread.currentThread().getName()+" started");
	int sum=0;
	for(int i=0;i<20;i++) {
		sum+=i;
	}
	System.out.println("sum=  "+sum+Thread.currentThread().getName()+" Ended");
	}
}


class MulRunnable implements Runnable{
	@Override
	public void run() {
			System.out.println(Thread.currentThread().getName()+" started");
	int res=1;
	for(int i=1;i<20;i++) {
		res*=i;
	}
	System.out.println("Result = " +res+Thread.currentThread().getName()+" Ended");
	}
}

public class LambdaDemoMul {

	public static void main(String[] args) {
		Thread t1 = new Thread(new AddRunnable(), "T1");
		Thread t2= new Thread(new MulRunnable(), "T2");
		t1.start();
		t2.start();
		
		//using Anonymous Runnable class
		Thread t3 = new Thread(()->{
			System.out.println(Thread.currentThread().getName()+" started");
			
			int res=0;
			for(int i=1;i<20;i++) {
				if(i%2 ==0)
					res+=i;
			}
			System.out.println("Result Even= " +res+Thread.currentThread().getName()+" Ended");
			
		},"T3-EvenAdd");
			
		
	
	
	//using Lambda Expression
	Thread t4= new Thread(()->{
		System.out.println(Thread.currentThread().getName()+" started");
		
		int res=0;
		for(int i=1;i<20;i++) {
			if(i%2 !=0)
				res+=i;
		}
		System.out.println("Result odd= " +res+Thread.currentThread().getName()+" Ended");
		
	},"T4-OddNum");
	t3.start();
	t4.start();
	
}
}