//Snippet 1: 

class Main { 
 public void main(String[] args) { 
 System.out.println("Hello, World!"); 
}
}
Ques:What error do you get when running this code?

Ans:when we declare a class name using public  access modifiers we have to 
make same name of file name .
error: class Main is public, should be declared in a file named Main.java
public class Main 

So here i can remove public or i can make file name Main so i am removing 
public access modifier.
So the correct code is:-

 class Main { 
 public void main(String[] args) { 
 System.out.println("Hello, World!"); 
}
}
output: Hello, World!




//Snippet 2: 

 class Main { 
 static void main(String[] args) { 
 System.out.println("Hello, World!"); 
}
}
Ques:What happens when you compile and run this code?

Ans:During Compile i am getting same error which i got in first ques.after 
removing public it will give another error:
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

So the correct code is:-

 class Main { 
public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
}
}

output: Hello, World!


//Snippet 3: 

class Main { 
 public static int main(String[] args) { 
 System.out.println("Hello, World!"); 
 return 0;
}
}
Ques:What error do you encounter? Why is void used in the main method?
Error: Main method must return a value of type void in class Main, please
define the main method as:
   public static void main(String[] args)
Ans:
Because Main method does not return anything that's why its return type is void.
when we give int return type in main method then we will get error.
So basically when main method terminates java program also terminates so it does
not make any use to return any value.As JVM can’t do anything with its return value.

class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 }
}



//Snippet 4: 

class Main{ 
 public static void main() { 
 System.out.println("Hello, World!"); 
}
}
Ques:What happens when you compile and run this code? Why is String[] args needed?

when i run this code i am getting this 
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

Ans:String args in Java is used to pass command-line arguments to a Java program.When we write the main() method 
without string args[], the code will compile but not run because the JVM fails to recognise the main() method.
When we want to pass an argument to the main(), we can pass it through String args[]. JVM always searches 
for the main() function that accepts an array of strings as an argument.



//Snippet 5: 

 class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 

}
}
Ques:Can you have multiple main methods? What do you observe?
output:Main method with String[] args
Ans:Java can have multiple main methods but with the concept of overloading. There should be only one main method with parameter as string[ ] arg.
Overloaded methods are methods with same name but with different signatures
but there should only be one main method with parameters like this 
 (String[] args) or (String args[]).



//Snippet 6: 

class Main { 
 public static void main(String[] args) { 
 int x = y + 10; 
 System.out.println(x); 
 } 
} 
ques:What error occurs? Why must variables be declared
 Error: cannot find symbol
 int x = y + 10;
         ^
  symbol:   variable y
  location: class Main
Ans: we have to decalre first any varible without declare we can not assign value  
and we also can not reassigning it in any vaiable . so first we have to declare y and assign
a value in y then we can assign y+10 in x variable.


//Snippet 7: 

class Main { 
 public static void main(String[] args) { 
 int x = "Hello"; 
 System.out.println(x); 

}
}
Ques:What compilation error do you see? Why does Java enforce type safety
Error: incompatible types: String cannot be converted to int
 int x = "Hello";
Ans: we cant not assign a string into int data type that's why is giving this error.
 The Java language is designed to enforce type safety.
In Java, type safety is crucial to avoid runtime errors and ensure reliable code       



//Snippet 8:
 
 class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!" 
 } 
} 
Ques:What syntax errors are present? How do they affect compilation?
Error:error: ')' expected
 System.out.println("Hello, World!"
Ans:small closing bracket is missing.Because Java is case sensitive language;



//Snippet 9: 

 class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} 
Error:Assignment2.java:168: error: not a statement
 int class = 10;
 ^
Assignment2.java:168: error: ';' expected
 int class = 10;
    ^
Assignment2.java:168: error: <identifier> expected
 int class = 10;
          ^
Assignment2.java:169: error: <identifier> expected
 System.out.println(class);
                   ^
Assignment2.java:169: error: illegal start of type
 System.out.println(class);
                    ^
Assignment2.java:169: error: <identifier> expected
 System.out.println(class);
                         ^
Assignment2.java:171: error: reached end of file while parsing
}
Ques:Why can't reserved keywords be used as identifiers?

Ans:Class name is reserved keyword for class in java.Reserved words are words that cannot be used as object or variable names in a Java program
 because they're already used by the syntax of the Java programming language




//Snippet 10: 

class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5);

}
} 
Ques:What happens when you compile and run this code? Is method overloading allowed?

Error:-error: non-static method display() cannot be referenced from a static context
 display();
 ^
Assignment2.java:205: error: non-static method display(int) cannot be referenced from a static context
 display(5);



//Snippet 11: 

 class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]);
}
}

Ques:What runtime exception do you encounter? Why does it occur?
Error:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
 Index 5 out of bounds for length 3 at Main.main(Assignment2.java:229)
Ans: Because this Array contains only 3 elements so size of this array is 3.but 
here i am printing element from fifth position of this array.
that's why it is giving index out of bound error.



//Snippet 12: 

 public class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop");
   
 
}
}
}
Ques:What happens when you run this code? How can you avoid infinite loops?
Error:class Main is public, should be declared in a file named Main.java
public class Main {
Ans:This loop is going infinite times because  condition while true is always true there 
is not any break condition.Infinite Loop is printing infinite times.

Correct code:

class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop");
   break;
}
}
}
 
//Snippet 13: 

 class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
}
}
Error:Exception in thread "main" java.lang.NullPointerException
        at Main.main(Assignment2.java:272)
Ques: What exception is thrown? Why does it occur
Ans:when str stores null value then string lenght is something zero that's why it giving error null
pointer exception.



//Snippet 14: 

 class Main { 
 public static void main(String[] args) { 
 double num = "Hello"; 
 System.out.println(num); 
 } 
} 
Ques: What compilation error occurs? Why does Java enforce data type constraints?
Ans:ERROR!
/tmp/xcQOJX7fTu/Main.java:6: error: incompatible types: String cannot be converted to double
 double num = "Hello"; 
we can not store a string into double data type it will gives error incompatible types.

//Snippet 15: 

public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 
Ques:What error occurs when compiling this code? How should you handle different data types 
in operations

ERROR!
/tmp/OaANzx2ZQR/Main.java:8: error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2; 
Ans:We can not store a double value into int data type here value might be loss .Addition of int and double then result is double.
that's why it is giving error possible lossy conversion.

//Snippet 16: 
 class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
} 

Ques: What is the result of this operation? Is the output what you expected?
OutPut:2.0

//Snippet 17: 

class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a ** b; 
 System.out.println(result); 
 } 
} 

Ques:What compilation error occurs? Why is the ** operator not valid in Java?

ERROR!
/tmp/CeMDCpQhdU/Main.java:8: error: illegal start of expression
 int result = a ** b; 
                 ^
Ans:we cant give two multiplication together 
there is no syntax in java arithmatic operation.


//Snippet 18: 

class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
} 
Ques: What is the output of this code? How does operator precedence affect the result?
output:20
Ans: here operator works according to BODMAS rule.first multiply to b then add into a.


//Snippet 19: 

 class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 
Ques: What runtime exception is thrown? Why does division by zero cause an issue in Java?
Error:ERROR!
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Main.main(Main.java:8)


//Snippet 20:
 
 class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World") 
 } 
} 
Ques:What syntax error occurs? How does the missing semicolon affect compilation?
ERROR!
/tmp/BIrZW2j2dz/Main.java:6: error: ';' expected
 System.out.println("Hello, World") 
Ans we get semicolon error after print hello world
correct:-System.out.println("Hello, World");

//Snippet 21: 

class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
} 
Ques:What does the compiler say about mismatched braces?
ERROR!
/tmp/H3MldJpp9O/Main.java:8: error: reached end of file while parsing
} 
 

//Snippet 22: 

public class Main { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 

Ques:What syntax error occurs? Can a method be declared inside another method?
ERROR!
/tmp/zcIqPHQaJd/Main.java:7: error: illegal start of expression
 static void displayMessage() { 
 ^
ERROR!
/tmp/zcIqPHQaJd/Main.java:11: error: class, interface, enum, or record expected
} 


//Snippet 23: 

public class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 case 3: 
 System.out.println("Value is 3"); 
 default: 
 System.out.println("Default case");
}
}
}
ques:Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent 
the program from executing the default case?
Output:-Value is 2
Value is 3
Default case


//Snippet 24: 

public class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
} 

Ques: Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation? 

Ans:Because In switch case first it will match conditon so here level is 1 in case 1 it will print level 1 but after SOP statement
we are not giving any break statement that's why it is printing level 2 again after level there is no break so it will print level 3 and it will print default case also but there is no break.
so it will print :
 
Level 1
Level 2
Level 3
Unknown level

But if we want to print only case 1 the we want to give break after case 1:

public class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 break;
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
} 
 


//Snippet 25: 

public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!");
}
}
}

Ques:Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work? 

Ans:Here code will not compile  compile because in Java, the switch statement does not support double or float types.In java switch statement only  accepts
 byte,short,char,int,string and wrapper class.
So here in this ques instead of using switch we can use if else statement:

public class Switch {
    public static void main(String[] args) {
        double score = 85.0;

        if (score == 100.0) {
            System.out.println("Perfect score!");
        } else if (score == 85.0) {
            System.out.println("Great job!");
        } else {
            System.out.println("Keep trying!");
        }
    }
}





//Snippet 26: 

public class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
}
}
}

Ques:Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block?

Ans: error: duplicate case label
 case 5: 

In Java, a switch statement requires that each case label must be unique within the same switch block.
Java will not compile this code.
Only one unique label for each value is allowed.
Having duplicate cases would create ambiguity since Java wouldn't know which block to execute for the same value.

So corrected code is:

public class Switch {
    public static void main(String[] args) {
        int number = 5;

        switch (number) {
            case 5:
                System.out.println("Number is 5");
                //here we also add another SOP statement
                break;
            default:
                System.out.println("This is the default case");
        }
    }
}



