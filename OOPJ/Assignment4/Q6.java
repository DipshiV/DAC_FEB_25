package Package2;

import java.util.Scanner;

class ElectricityBill{
	private String customerName;
	private double unitConsumed;
	private double billAmount;
	
	ElectricityBill(String customerName,double unitConsumed){
		this.customerName=customerName;
		this.unitConsumed=unitConsumed;	
		
	}
	public void calculateBillAmount() {
		if(unitConsumed<=100) {
			billAmount=unitConsumed*5;
		}else if(unitConsumed>=101 && unitConsumed<=300) {
		billAmount=100*5+(unitConsumed-100)*7;
	}else {
		billAmount=100*5+100*7+(unitConsumed-200)*10;
	}
	System.out.println("Total Bill: "+billAmount);
}
	void displayDetails() {
		System.out.println("Customer name: "+customerName);
		System.out.println("Unit Consumed: "+unitConsumed);
	}
}

public class Q6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter unitConsumed");
		double unitConsumed=sc.nextDouble();
		 ElectricityBill eb= new ElectricityBill(name, unitConsumed);
		 eb.displayDetails();
		 eb.calculateBillAmount();
sc.close();
	}

}
