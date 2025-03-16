class BMW{
	void showDetails(){
		System.out.println("This is a BMW ");
	}
	void maxSpeed(){
		System.out.print("Speed varies by model.");
	}
}
class BMWSeries3 extends BMW{
	void showDetails(){
		System.out.println("This is a BMWSeries3 ");
	}
	void maxSpeed(){
		System.out.println("Speed is 240km/h");
	}
}
class BMWSeries5 extends BMW{
	void showDetails(){
		System.out.println("This is a BMWSeries5.");
	}
	void maxSpeed(){
		System.out.println("Speed is 260 km/h.");
	}
	
}
class BMWSeries7 extends BMW{
	void showDetails(){
		System.out.println("This is a BMWSeries7.");
	}
	void maxSpeed(){
		System.out.println("Speed is 300 km/h");
	}
	
}

class PolymorphismMain{
	public static void main(String args[]){
		BMWSeries3 b1 = new BMWSeries3();
		BMWSeries5 b2= new BMWSeries5();
		BMWSeries7 b3= new BMWSeries7();
		BMW arr[] = {b1,b2,b3};
		for(int i=0;i<arr.length;i++){
			arr[i].showDetails();
			arr[i].maxSpeed();
			System.out.println("----------------------");
		}
	}
}