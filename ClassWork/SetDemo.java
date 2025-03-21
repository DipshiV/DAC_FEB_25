package package1;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;



public class SetDemo {
	public static void main(String args[]) {
	Set<String> hashSet = new HashSet<>();
	hashSet.add("Apple");
	hashSet.add("Banana");
	hashSet.add("Cherry");
	System.out.println(hashSet);
	
	LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
	linkedHashSet.add("Apple");
	linkedHashSet.add("Banana");
	linkedHashSet.add("Cherry");
	System.out.println(linkedHashSet);

	

}
}
