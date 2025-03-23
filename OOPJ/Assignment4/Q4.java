package Package2;

import java.util.Scanner;

class BMICalculator{
	private double height;
	private double weight;
	BMICalculator(double height, double weight){
		
		setHeight(height);
		
		setWeight(weight);
	}
	public void setHeight(double height) {
			this.height=height; 
			
		
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
	public double calculateBMI() {
		double BMI=weight/(height*height);
		return BMI;
	}
}

public class Q4 {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter height");
	double height=sc.nextDouble();
	System.out.println("Enter weight");
	double weight=sc.nextDouble();
	BMICalculator bmi= new BMICalculator(height,weight);
	System.out.println("Calculate BMI: "+bmi.calculateBMI());
	sc.close();
	
}
}
