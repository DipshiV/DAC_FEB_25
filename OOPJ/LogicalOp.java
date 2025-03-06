/* 11. Write a program to check if a number is positive and
 even using logical operators (&&, ||, !).*/
 import java.util.Scanner;
 public class LogicalOp{
 public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a Number");
  int number =sc.nextInt();
  if(number>0 && number%2 ==0){
	  System.out.print(number+ " Number is positive and even");
  }else if(number>0 && number%2 !=0){
	  System.out.print(number+ " Number is positive and odd");
  }else if(number>0 || number%2 ==0){
	  if(number >0){
		  System.out.print(number+ " Number is positive");   
	  }else{
	  System.out.print(number+ " Number is even only");  
	  }
  }
  else if(number<0){
	  System.out.print(number+ " Number is negative");
  }else{
	  System.out.print("Number is zero");
  }
  
  
 }
 }