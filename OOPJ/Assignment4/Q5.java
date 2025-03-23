package Package2;
class ComplexNumber{
	private double real;
	private double imaginary;
	
	
	public ComplexNumber(){
		this.real=0;
		this.imaginary=0;
		
	}
	public ComplexNumber(double real){
		this.real=real;
		this.imaginary=0;
		
	}
	public ComplexNumber(double real,double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public ComplexNumber add(ComplexNumber other) {
		return new ComplexNumber(this.real+other.real,imaginary+other.imaginary);
	}
	public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }
	
	 public void display() {
	        if (imaginary >= 0) {
	            System.out.println(real + " + " + imaginary + "i");
	        } else {
	            System.out.println(real + " - " + (-imaginary) + "i");
	        }
	    }
	
}
public class Q5 {

	public static void main(String[] args) {
		 ComplexNumber c1 = new ComplexNumber(3, 2);
	        ComplexNumber c2 = new ComplexNumber(4, -2);

	        // Calculating their sum and product
	        ComplexNumber sum = c1.add(c2);
	        ComplexNumber product = c1.multiply(c2);

	        // Display results
	        System.out.print("Sum: ");
	        sum.display();

	        System.out.print("Product: ");
	        product.display();
		

	}

}
