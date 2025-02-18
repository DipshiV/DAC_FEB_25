1-Check Positive Number:

// Import the Scanner class
import java.util.Scanner;  
class Main {
   public static void main(String[] args) {
   //for user input
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a number");      
    int number=sc.nextInt();
    if(number>=0){
     System.out.print("Number is Positive");
      }else{
      System.out.print("Number is Negative");
}
}
}


2-Check Negative Number:
import java.util.Scanner;  
class Main {
   public static void main(String[] args) {
   //for user input
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a number");      
    int number=sc.nextInt();
    if(number<0){
     System.out.print("Number is Negative");
      }else{
     System.out.print("Number is Positive");
}
}
}
3-Check Odd or Even Number:
import java.util.Scanner;  
class Main {
   public static void main(String[] args) {
   //for user input
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a number");      
    int number=sc.nextInt();
    if(number%2==0){
     System.out.print("Number is even");
      }else{
     System.out.print("Number is odd");
}
}
}
4-Display Good Morning Message Based on Time:
import java.util.Scanner;  
class Main {
   public static void main(String[] args) {
   //for user input
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter Time");     
    int time =sc.nextInt();
    if(time>=5 && time<=12){
     System.out.print("Good Morning");
      }else{
    System.out.print("Please Give Time is in 5am to 12pm");
      }
}
}

5-Print Area of a Square:

import java.util.Scanner;  
class Main {
   public static void main(String[] args) {
   //for user input
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter side");     
    int side =sc.nextInt();
    int area=side*side;
    System.out.print("Area of a triangle is "+area);
}
}

6-Print Area of a Rectangle:
import java.util.Scanner;  
class Main {
   public static void main(String[] args) {
   //for user input
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter length");
    int length =sc.nextInt();
     System.out.println("Enter breath");
    int breath=sc.nextInt();
    int area=length * breath;
    System.out.print("Area of a triangle is "+area);
}
}
 
7-Find the Largest of Three Numbers:
import java.util.Scanner;  
class Main {
   public static void main(String[] args) {
   //for user input
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter First Number");
    int num1 =sc.nextInt();
     System.out.println("Enter Second Number");
    int num2=sc.nextInt();
    System.out.println("Enter Third Number");
    int num3=sc.nextInt();
     if(num1>num2 && num1>num3){
    System.out.print("First Number is Greater");
     }else if(num2>num1 && num2>num3){
         System.out.print("Second Number is Greater");
     }else{
         System.out.print("Third Number is Greater");
     }
     }    
     }



