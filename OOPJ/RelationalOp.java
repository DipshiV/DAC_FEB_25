/*10. Write a program to compare two integers using 
all relational operators (==, !=, >, <, >=, <=)and display the results.*/
import java.util.Scanner;
public class  RelationalOp{
	  public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
		
		System.out.println("num1 == num2: " + (num1 == num2));  // Equal to
        System.out.println("num1 != num2: " + (num1 != num2));  // Not equal to
        System.out.println("num1 > num2: " + (num1 > num2));    // Greater than
        System.out.println("num1 < num2: " + (num1 < num2));    // Less than
        System.out.println("num1 >= num2: " + (num1 >= num2));  // Greater than or equal to
        System.out.println("num1 <= num2: " + (num1 <= num2));  // Less than or equal to
}
}