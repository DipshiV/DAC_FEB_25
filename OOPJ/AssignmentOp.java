/*Write a program to demonstrate the use of assignment operators 
 (=, +=, -=, *=, /=, %=) on two integers.*/

import java.util.Scanner;
public class AssignmentOp {
    public static void main(String[] args) {
       
       Scanner sc= new Scanner(System.in);
	    System.out.println("Initial value of num1: ");
	   int num1=sc.nextInt();
	     System.out.println("Initial value of num2: ");

	   int num2=sc.nextInt();

       
       
      
        // Using += operator
        num1 += num2; 
        System.out.println("After num1 += num2, num1 = " + num1);

        // Using -= operator
        num1 -= num2; 
        System.out.println("After num1 -= num2, num1 = " + num1);

        // Using *= operator
        num1 *= num2; 
        System.out.println("After num1 *= num2, num1 = " + num1);

        // Using /= operator
        num1 /= num2; 
        System.out.println("After num1 /= num2, num1 = " + num1);

        // Using %= operator
        num1 %= num2; 
        System.out.println("After num1 %= num2, num1 = " + num1);
    }
}
