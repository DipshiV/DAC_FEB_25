/*1. Implement NullPointerException
Write a Java program where you initialize a String as null and try to call the .
length() method on it.Handle the exception using a try-catch block.*/

class Exception{
public static void main(String args[]){
    try{
String str=null;
System.out.print(str.length());
}catch(NullPointerException e){
    e.printStackTrace();
    System.out.println("NullPointer Exception");
}
}
}


//2-  Implement ArithmeticException

class Exception{
public static void main(String args[]){
    int i=13;
    int j=0;
    try{
int k=i/j;
System.out.println(k);
}catch(ArithmeticException e){
e.printStackTrace();
System.out.println("Arithmetic Exception");
}
}
}

//3-. Implement ArrayIndexOutOfBoundsException

class Exception{
public static void main(String args[]){
    int arr[]= new int[5];
    
    try{
arr[6]=20;
System.out.println(arr[6]);
}catch(ArrayIndexOutOfBoundsException e){
e.printStackTrace();
System.out.println("ArrayIndexOutOfBoundsException");
}
}
}

//4-Implement NumberFormatException

class Exception{
public static void main(String args[]){
   String s= "ABC123"; 
    try{
int num= Integer.parseInt(s);
System.out.println("coverted number= "+num);
}catch(NumberFormatException e){
e.printStackTrace();
System.out.printlnln("NumberFormatException");
}
}

//5-NumberFormatException

class IllegalArgumentExceptionExample {
    static void setAge(int age)throws IllegalArgumentException {
        if (age < 0 || age > 150) {
           throw new  IllegalArgumentException("Invalid age: " + age + ". Age must be between 0 and 150.");
        }
        System.out.println("Age set to: " + age);
    }

    public static void main(String[] args) {
        try {
            setAge(25);   
            setAge(-5);  
            setAge(200); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

//6-. Implement IOException

//7-.Implement FileNotFoundException
class Exception {

static void readFile() throws IOException {  
    throw new IOException("File not found!");
}

public static void main(String[] args) {
    try {
        readFile();  
    } catch (IOException e) {  
        System.out.println("Exception handled in main: " + e.getMessage());
    }
}
}