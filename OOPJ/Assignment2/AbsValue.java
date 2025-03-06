/*Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise
operators. 
Hint  :  mask = num >> 31; abs = (num + mask) ^ mask;*/
import java.util.Scanner;

public class AbsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
	  
        
        int mask = num >> 31; 
		System.out.println("mask" +mask);
		// Extracts the sign bit (0 for positive, -1 for negative)
       
	   int abs = (num + mask) ^ mask; // Computes absolute value using bitwise operations
        
        System.out.println("Absolute value: " + abs);
        
    }
}
