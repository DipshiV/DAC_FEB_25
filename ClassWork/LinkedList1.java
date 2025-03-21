package package1;
import java.util.LinkedList;

public class LinkedList1{
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + linkedList.get(1));

        // Removing an element
        linkedList.remove(1);

        // Displaying the final list
        System.out.println("Final List: " + linkedList);
        linkedList.remove("Cherry");
        System.out.println("Final List: " + linkedList);
  System.out.println(linkedList.poll());
    }
}
