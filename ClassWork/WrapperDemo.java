class WrapperDemo{
public static void main(String args[]){
int a =20; //Primitive data

//Integer i = new Integer(20);//int
//Integer i1= new Integer("20");//String value

//Autoboxing primitive to wrapper class object
//Method 1: ValueOf()
Byte b = Byte.valueOf("20");
Short s = Short.valueOf("20");
Integer i = Integer.valueOf(a); //Explicit conversion
Long l= Long.valueOf(a);
Float f= Float.valueOf(a);
Double d= Double.valueOf(a);

System.out.println("Byte = "+b);
System.out.println("Short = "+s);
System.out.println("Integer = "+i);
System.out.println("Long = "+l);
System.out.println("Float = "+f);
System.out.println("Double = "+d);



//Method 2 : Compiler automatic conversion

byte b1= 127;
Integer j= a; //No Error
System.out.println(j);

Byte B = b1;
System.out.println(B);

// Method 1- Unboxing
Integer a1= new Integer (30); 
//Explicit conversion 
int i1= a1.intValue();
System.out.println(i1);

//Method 2:
int j1= a1; //compiler automatic conversion

System.out.print(j1);
 




}}