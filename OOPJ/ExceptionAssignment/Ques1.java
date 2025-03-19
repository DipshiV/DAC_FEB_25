//Q1. Electricity Bill Calculation with Exception Handling
import java.util.*;

class ElectricityBill {
    String customerName;
    double unitsConsumed;
    double billAmount; 

   
    ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;

        if (unitsConsumed < 0) {
            throw new IllegalArgumentException("Invalid unit consumed. It should be positive.");
        }
        this.unitsConsumed = unitsConsumed;
    }

    
    void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

   
    void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs. " + billAmount);
    }
}

public class Ques1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
           
            System.out.print("Enter Customer Name: ");
            String cusName = sc.nextLine();

            System.out.print("Enter Units Consumed: ");
            double unitsConsumed = sc.nextDouble();

           
            ElectricityBill e = new ElectricityBill(cusName, unitsConsumed);
            e.calculateBillAmount(); 
            e.displayBill();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value for units.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close(); 
        }
    }
}
