class Parent{
int x=10;
Abc a2; //reg of Abc
} 
class Child extends Parent{
int x=30;
int y=20;
Abc a2; //reg of Abc
}
class Abc{
void m1(){
	Xyz x = new Xyz();
	x.start();
}
}
class Xyz{
	void start(){
		
	}
}
class DemoInharitance{
public static void main(String args[]){

Parent p1 = new Parent();
System.out.println(p1.x);
System.out.println(p1.y); //Error


Child c = new Child();
System.out.println(c.x);
System.out.println(c.y);

Parent p = new Child();
System.out.println(p.x);
System.out.println(p.y); //Error
Abc a1; //reg of Abc


} 