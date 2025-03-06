/*12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.*/

import java.util.Scanner;

public class Q12{
public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		
        System.out.println("Initial values: a = " + a + ", b = " + b);

      
        a += b;  // Equivalent to a = a + b
        System.out.println("After a += b, a = " + a);  // a = 10 + 5 = 15

      
        a -= b;  // Equivalent to a = a - b
        System.out.println("After a -= b, a = " + a);  // a = 15 - 5 = 10

       
        a *= b;  // Equivalent to a = a * b
        System.out.println("After a *= b, a = " + a);  // a = 10 * 5 = 50

       
        a /= b;  // Equivalent to a = a / b
        System.out.println("After a /= b, a = " + a);  // a = 50 / 5 = 10

        
        a %= b;  // Equivalent to a = a % b
        System.out.println("After a %= b, a = " + a);  // a = 10 % 5 = 0
			}
			}