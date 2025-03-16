//Diamond Problem
interface Printer{
	
default void print() {
        System.out.println("Printing document...");
    }	
}

interface Scanner{
	default void scan(){
	System.out.println("Scanning document...");
	}
	
}

interface Computer extends Printer{
	default void Deep(){
	System.out.println("interface Comp...");
	}
	
}

interface Laptop extends Scanner{
	default void lap(){
	System.out.println("interface Laptop...");
	}	
}

class Test implements Computer,Laptop{
	void testM(){
		System.out.print("Class Test");
	}
	
}
class Diamond {
	public static void main(String[] args){
		Test t1 = new Test();
		t1.print();
		t1.scan();
		t1.Deep();
		t1.lap();
		t1.testM();
}

}
