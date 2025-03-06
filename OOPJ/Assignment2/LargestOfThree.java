/*Q6:  Write a program to find the  largest of three numbers  using only the  ternary operator 
(  ? :  )  . */
import java.util.Scanner;
public class LargetOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
          System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		  System.out.print("Enter third number: ");
		int num3 = sc.nextInt();
		int res=(num1>num2) ? ((num1>num3)?num1:num3):
		 ((num2>num3)? num2:num3);
		System.out.print("Largest is= " +res);
	
       			
    }
}