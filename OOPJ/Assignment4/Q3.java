package Package2;

import java.util.Scanner;

class Box{
	int height;
	int width;
	int breadth;
	Box(int height,int width,int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	public int getVolume() {
		return height*width*breadth;
		
	}
	public int getArea() {
		int area=(2*height*width)+(2*height*breadth)+(2*width*breadth);
		return area;
	}
}

public class Q3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter height");
		int h=sc.nextInt();
		System.out.println("Enter width");
		int w=sc.nextInt();
		System.out.println("Enter breadth");
		int b= sc.nextInt();
		
     Box box= new Box(h,w,b); 
     System.out.println("volume "+box.getVolume());
     System.out.println("area= "+box.getArea());
     sc.close();
	}

}
