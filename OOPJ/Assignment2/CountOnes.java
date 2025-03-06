/*Q14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a 
number using bitwise operations     Hint  : Use  n & (n - 1) */

import java.util.Scanner;
public class CountOnes{
	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a Number");
        int n= sc.nextInt();
        int count=0;
        while(n>0){
        count += ( n & 1 );
        n >>= 1;
}
     System.out.println("Count of Ones in a binary number " +count);   
    }
}