//Assignment2-Section2:
//Question 1: Grade Classification 

import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter your score");
      int score= sc.nextInt();
      if(score >=90){
          System.out.print("Grade A");
      }
      else if(score>=80 && score<=89){
          System.out.print("Grade B");
      }
      else if(score>=70 && score<=79){
          System.out.print("Grade C");
      }
      else if(score>=60 && score<=69){
          System.out.print("Grade D");
      }
      else{
          System.out.print("Grade F");
      }
      
      }
      }

//Question 2: Days of the Week 

import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a Day");
      String day=sc.nextLine();
      switch(day){
          case"Monday":System.out.print("1");
          System.out.print("It is weekday");
          break;
          case"Tuesday":
              System.out.println("2");
               System.out.print("It is weekday");
              break;
        
          case"Wednesday":
              System.out.println("3");
               System.out.print("It is weekday");
              break;
              case"Thursday":
                  System.out.println("4");
                  System.out.print("It is weekday");
              break;
              case"Friday":
                  System.out.println("5");
                  System.out.print("It is weekday");
              break;
              case"Saturday":
                  System.out.println("6");
                  System.out.print("It is weekend");
              break;
              case"Sunday":
                  System.out.println("7");
                  System.out.print("It is weekend");
              break;
              default:
              System.out.print("wrong input");
              break;
                  
      }
    
      }
      }


//Question 3: Calculator 
class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter first Number");
      int num1= sc.nextInt();
       System.out.println("Enter second Number");
       int num2= sc.nextInt();
        System.out.println("Enter a operator");
        char op=sc.next().charAt(0);
       int res= 0;
        
        switch(op){
            case '+':res=num1+num2;
            break;
            case'-':res=num1-num2;
            break;
            case'*':res=num1*num2;
            break;
            case'/':res=num1/num2;
            break;
            default:System.out.print("Error");
        }
        System.out.print("The result is given as follows:");
        System.out.print(num1 + " " + op + " " + num2 + " = " + res);
      
      }
      }
      

//Question 4: Discount Calculations

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total purchase amount
        System.out.print("Enter total purchase amount (Rs.): ");
        double amount = scanner.nextDouble();

        // Input membership card status
        System.out.print("Do you have a membership card? (yes/no): ");
        String membership = scanner.next();

        // Initialize discount
        double discount = 0;

        // Apply discount based on purchase amount
        if (amount >= 1000) {
            discount = 20;
        } else if (amount >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }

        // Add extra 5% discount if user has a membership card
        if (membership.equalsIgnoreCase("yes")) {
            discount += 5;
        }

        // Calculate final amount
        double discountAmount = (discount / 100) * amount;
        double finalAmount = amount - discountAmount;

        // results
        System.out.println("You got a discount of " + discount + "%");
        System.out.println("Discount amount: Rs. " + discountAmount);
        System.out.println("Amount to pay after discount: Rs. " + finalAmount);
    }
}





//Question 5: Student Pass/Fail Status with Nested Switch 

import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = sc.nextInt();

        // Count the number of subjects failed
        int failCount = 0;

        if (subject1 <= 40) {
            failCount++;
        }
        if (subject2 <= 40) {
            failCount++;
        }
        if (subject3 <= 40) {
            failCount++;
        }

        // Check pass or fail status
        if (failCount == 0) {
            System.out.println("Congratulations! You have passed all subjects.");
        } else {
            System.out.println("You have failed in " + failCount + " subject(s).");
        }

       
    }
}



