/* Q20:  Implement a Java program that  returns the absolute value  of a given number using 
the ternary operator (without using  Math.abs()  ). */
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int absValue = (num < 0) ? -num : num;

        System.out.println("The absolute value is: " + absValue);

    }
}
