abstract class Shape{
protected String shapeName;
   Shape(String shapeName){
   this.shapeName=shapeName;
   }
   abstract double calculateArea();
   String getShapeName(){
	   return shapeName;
}
}

class Circle extends Shape{
private double radius;

Circle(double radius){
    super("Circle");
this.radius=radius;
}
double calculateArea(){
double area= 3.14*radius*radius;
return area;
 }
}

class Rectangle extends Shape{
private double length;
private double width;

Rectangle(double length, double width){
    super("Rectangle");
this.length=length;
this.width=width;
}

double calculateArea(){
double area=length*width;
return area;
}
}

public class ShapeMain{
	public static void main(String args[]){
		Circle c= new Circle(5.0);
		double area1=c.calculateArea();
		System.out.println("circle area= "+ area1);
		
		Rectangle r= new Rectangle(4.0,6.0);
		double area2=r.calculateArea();
		System.out.println("Rectangle area= "+ area2);
	}
}