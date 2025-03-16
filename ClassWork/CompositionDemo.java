//CompositionDemo
class Engine{
	String type;
	
	Engine(String type){
		this.type=type;		
	}
	
}

class Car{
	String model;
	Engine e; //composition (Strong Has-A relationship)
	
	Car(String model,String type){
		this.model= model;
		this.e= new Engine(type); //Creating an object inside the contructor		
	}
	
	void display(){
		System.out.print(model+" "+e.type);
	}	
}

class CompositionDemo{
	public static void main(String args[]){
		Car c1= new Car("Nexon","X2");
		   c1.display();	
	}
}