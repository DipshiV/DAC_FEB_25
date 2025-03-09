/*Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 
50)  without using  if-else  . 
Hint  : Use  logical AND (  &&  ) in a print statement  . */
import java.util.Scanner;

public class RangeCheckWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        System.out.println("Is the number within the range (20 to 50)? " + (number >= 20 && number <= 50));
    }
}


 