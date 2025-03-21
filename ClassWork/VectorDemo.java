package package1;
import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector= new Vector<>();
		vector.add("Dipshi");
		vector.add("Pushpa");
		vector.add("Parul");
		System.out.println(vector);
		vector.add(2,"Arun");
		vector.add(4,"Anupam");
		System.out.println(vector.get(3));
		System.out.println(vector);
		vector.set(1, "Vishnu");
		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.indexOf("Dipshi"));
		System.out.println(vector.capacity());
		vector.ensureCapacity(20);
		System.out.println(vector.capacity());
		Enumeration<String> en = vector.elements();
		while (en.hasMoreElements()) {
		    System.out.println(en.nextElement());
		}


		
		
		

	}

}
