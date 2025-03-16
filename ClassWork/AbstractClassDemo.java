
abstract class Vehicle{	
abstract void color();

 void display(){
 System.out.println("Vehicle display ");
}
}
class Bike extends Vehicle{
	void color(){
		System.out.print("Abstract method");
	}

void show(){
	System.out.print("Bike name");
}

static void average(){
	System.out.print("Average is 30km/h");
}

}
class AbstractClassDemo{
public static void main(String[] args){
Bike b = new Bike();
b.color();
b.display();
b.show();
b.average();
  

}
}