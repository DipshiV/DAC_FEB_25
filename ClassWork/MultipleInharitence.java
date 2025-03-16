//Multilevel

interface A{ //parent interface
void show();
default void display1(){
	System.out.println("Hello from Parent interface");
}

}
interface B extends A{ //child interface
default void display2(){
	System.out.println("Hello from chile B");
}

}
interface C extends A{ //child interface
 default void display3(){
	 System.out.println("Hello from child c");
 }
}
class D implements B,C{
	public void show(){
	 System.out.println("Hello from show method");
 }
	
	 public void display(){
	 System.out.println("Hello from class");
 }
	
}

class MultipleInharitence{
	public static void main(String args[]){
		D d= new D();
      		d.display();
			d.show();
			d.display1();
			d.display2();
			d.display3();
			
	}
}
