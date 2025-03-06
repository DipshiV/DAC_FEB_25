//Problem-8 Arithmetic Operation
import java.util.Scanner;
import java.util.*;
class First{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter First Number");
	int num1=sc.nextInt();
	System.out.print("Eneter Secong Number");
    int num2=sc.nextDouble();
	
    System.out.println("Addition: " + (num1+num2));
	System.out.println("Substraction: " +(num1-num2));
	System.out.println("Multiplication: " +(num1*num2));
	System.out.print("Divide: " +(num1/num2));
	System.out.print("Modulo: " +(num1%num2));
	sc.close();
	

}
}

