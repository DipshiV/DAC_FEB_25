
class Flower{
 String name;
 String color;
boolean hasFragrance =false;
   Flower(String name,String color,boolean hasFragrance ){
 	   this.name=name;
 	   this.color= color;
 	   this.hasFragrance=hasFragrance;  
   }

}
class Rose extends Flower{
	boolean hasThorns= false;
	
	Rose(String name,String color,boolean hasFragrance,boolean hasThorns){
      super(name,color,hasFragrance);
	   this.hasThorns=hasThorns;  
	
	}
	void display(){
		System.out.println("Flower Name: " +name);
		System.out.println("Color: "+color);
	System.out.println("Has Fragrance: " + (hasFragrance ? "Yes" : "No"));
    System.out.println("Has Thorns: " + (hasThorns ? "Yes" : "No"));
		
	}

}
class Lily extends Flower{
	boolean isWaterPlant=false;
Lily(String name,String color,boolean hasFragrance,boolean isWaterPlant){
	   super(name,color,hasFragrance);
	   this.isWaterPlant=isWaterPlant;  
	
	}
	void display(){
		System.out.println("Flower Name: " +name);
		System.out.println("Color: "+color);
		System.out.println("Has Fragrance: " +(hasFragrance ? "yes" : "No"));
		System.out.println("Grows in Water: " +(isWaterPlant ? "yes" : "No"));
		
	}
}
class FlowersMain{
	public static void main(String args[]){
		Rose r= new Rose("Rose","Red", true, true);
		Lily l = new Lily("Lily","White", true, true);
		r.display();
		l.display();
	}
}