/*Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus 
(  %  ) and division (  /  ) operators */
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digit = sc.nextInt();
		int sum=0;
		sum=sum+digit%10;
		digit=digit/10;
		}
        System.out.print("Sum = " +sum);		
    }
}