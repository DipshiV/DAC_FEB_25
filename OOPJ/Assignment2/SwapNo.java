/*Q5:  Write a Java program to  swap two numbers  using the  +=  and  -=  operators only*/import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
          System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		num1+=num2;
		num2=num1-num2;
		num1-=num2;
		
        System.out.println("First Number = " +num1);
        System.out.println("Second Number = " +num2);			
    }
}