package package1;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer>stack= new Stack<>();
stack.add(1);
stack.add(12);
stack.add(13);
stack.add(14);
stack.add(14);
stack.add(11);
stack.add(17);
System.out.print(stack);
stack.push(3);
System.out.println(stack);
System.out.println(stack.search(14));

	}

}
