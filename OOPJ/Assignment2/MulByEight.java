/*Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
Hint  : Use bitwise left shift (  <<  ).*/


import java.util.Scanner;

public class PowerOfTwo {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
		int b=3;
        System.out.print( a<<b );
        
    }
}
