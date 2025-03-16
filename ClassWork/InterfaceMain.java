interface Photosynthesis{
void absorbSunlight();
	
}
interface Respiration{
	void releaseOxygen();
}
class Plant implements Photosynthesis,Respiration{
	private String plantName;
	Plant(String name){
		this.plantName=name;
	}
	String getPlantName(){
		return plantName;
	}
 public	void absorbSunlight(){
		System.out.println( "Plant is absorbing sunlight for photosynthesis." );
	}
  public void releaseOxygen(){
		System.out.println( "Plant is releasing oxygen through respiration." );
	}
}

public class InterfaceMain{
	public static void main(String args[]){
		Plant p1 = new Plant("Mango Tree");
		Plant p2 = new Plant("Fern");
		p1.absorbSunlight();
		p1.releaseOxygen();
		p2.absorbSunlight();
		p2.releaseOxygen();
		
		
	}
}