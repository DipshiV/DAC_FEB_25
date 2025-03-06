/*Q1:  Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  -  . 
Hint  : Use bitwise XOR  ^  operator.*/


import java.util.Scanner;
class SwapUseXor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the first No");
       int num1=sc.nextInt();
       System.out.println("Enter the second No");
       int num2=sc.nextInt();
     
       num1=num1^num2;
       num2=num1^num2;
       num1=num1^num2;
       System.out.println("After Swap:" +num1);
       System.out.print("After Swap:" +num2);
    }
}