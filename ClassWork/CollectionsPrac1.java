package package1;
import java.util.*;
public class CollectionsPrac1 {
	
	    public static void main(String[] args) {
	       
	        List<String> list = new ArrayList<>();

	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Banana"); 

	        System.out.println("List: " + list);
	        list.add(1, "Orange");
	        System.out.println(list);
	        String fruit = list.get(2);
	        System.out.println("Element at index 2: " + fruit);

	        list.set(1, "Pineapple");
	        System.out.println(list);

	        list.remove(2);
	        System.out.println(list);
	        list.remove("Banana");
	        System.out.println(list);
	        boolean exists = list.contains("Mango");
	        System.out.println("Is Mango in the list? " + exists);

	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Banana");

	        System.out.println("Index of Banana: " + list.indexOf("Banana"));

	       // System.out.println(list);
	        ListIterator<String> listItr = list.listIterator();
	        while (listItr.hasNext()) {
	            System.out.println(listItr.next());
	        }

	        


}
}
