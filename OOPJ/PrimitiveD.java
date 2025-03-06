/*1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned 
values.*/

public class PrimitiveD{
	static byte defaultByteVal;
    static short defaultShortVal;
    static int defaultIntVal;
    static long defaultLongVal;
    static  float defaultFloatVal;
    static double defaultDoubleVal;
    static char defaultCharVal;
    static boolean defaultBooleanVal;
		
public static void main(String []args){
	
	    System.out.println("Default byte: " + defaultByteVal);
		System.out.println("Default int: " + defaultIntVal);
		System.out.println("Default char: " + defaultCharVal);
		System.out.println("Default boolean: " + defaultBooleanVal);
		System.out.println("Default float: " +  defaultFloatVal);
		System.out.println("Default double: " + defaultDoubleVal);
		System.out.println("Default short: " + defaultShortVal);
		System.out.println("Default long: " + defaultLongVal);	
	}
}