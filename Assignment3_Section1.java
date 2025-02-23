//Snippet 1: 

public class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i--) { 
 System.out.println(i); 
 } 
 } 
} 
// Error to investigate: 
//Why does this loop run infinitely?
 How should the loop control variable be adjusted? 


Ans:here in this loop is we are starting  i's value from  0.first it will print 0 then it will decrement by 1 .i's value  becomes -1 and print -1.after that we will check -1 less than 10 
it will print -1 then again decrement by -1 .i's value becomes -2 again it is less than 10 true  print -2 again decrement an so on.loop will go in infinite process .

To stop infinite loop instead of decrementing we can increment i's value and print 0 to 9 values.

correct code:
public class InfiniteForLoop{ 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i++) { 
 System.out.println(i); 
 } 
 } 
} 
  


//Snippet 2: 

public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count = 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 

// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the  while loop?error: incompatible types: int cannot be converted to boolean
 while (count = 0) 

Ans: Here in this ques count value is 5 but we are giving  count value to 0 it will never go in while loop because initially count value is 5.so here i can give (count>0) so that 
when it will check 5>0 is true it will print then dercement count 5 to 4 and so on till 0 when count value is 0 itis not greater than 0 condition will false and we are out of the loop.   


Correct code :public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count >0) { 
 System.out.print(count); 
 count--; 
 } 
 } 
} 

output:5 4 3 2 1




//Snippet 3: 

public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num > 0); 
 } 
} 
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile` loop? 

Ans: This do while loop goes in infinite loop.  In this program num value equal to 0 then using do while it will print first 0 then num value increment 0 to 1 and checking 1>0 then
again it will print 1 and so on .Because num value will be always greater than 0 so it will print again & again till space is available in memory.



//Snippet 4: 

public class OffByOneErrorForLoop { 
 public static void main(String[] args) { 
 for (int i = 1; i <= 10; i++) { 
 System.out.println(i); 
 } 
 // Expected: 10 iterations with numbers 1 to 10 
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
 } 
} 
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the 

correct code:public class OffByOneErrorForLoop { 
public static void main(String[] args) { 
 for (int i = 1; i <10; i++) { 
 System.out.println(i); 
 } 
}
}
Output:
1
2
3
4
5
6
7
8
9

//Snippet 5: 

public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i++) { 
 System.out.println(i); 
 } 
 } 
} 
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop? 

Ans: so this loop is going into infinite times because here 10 greater than 0 and every time it will increment by one and print.i always greater than and equal to 0 that's why loop is goin on infinit times.



//Snippet 6: 

public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) 
 System.out.println(i); 
 System.out.println("Done"); 
 } 
} 
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to 
include all statements within the loop?

Ans: Because after loop statement we did not give a block statement for loops like open and close bracket of loop
that's why without opening and close bracket it considers only line in loop.
so i pritnting inside loop and second SOP statement is outside of loop that's why DONE is print once. 
 for enclosing all statements in loop we have to give opening and closing bracket.

correct code: public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) {
 System.out.println(i); 
 System.out.println("Done"); 
}
 } 
} 



//Snippet 7: 

public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
} 
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop variable properly? 
Compilation Error:ERROR!
/tmp/bcNh61jqth/Main.java:7: error: variable count might not have been initialized
 while (count < 10) 

Ans: first we have initialize count value then we compare in while loop like count value is less than 10 or not .
correct code:public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count=0; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
} 
output:0
1
2
3
4
5
6
7
8
9


//Snippet 8:
 
public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num > 0); 
 } 
} 
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the 
numbers from 1 to 5?
Ans: here in this code first we enter  in do and print 1 then decrement by value will become -1 after that we are checking -1>0 but it will false and we are out of the loop.
for printing 1 to 5  first print 1 and then increment by  number to one then we have to  change chcek condition num<=5 so that it will print values 1 to 5. 

correct code:public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num <=5); 
 } 
} 
output:1
2
3
4
5


//Snippet 9: 

public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.print(i); 
 } 
 } 
} 
o/p:0 2 4
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update expression be corrected? 
Ans: So in this code loop is starting from 0 to 4 and here we are incrementing i's every time +2  so output will come 0 2 4  so if we want print 0 to 4 continuously then increment i's value to
1.
 correct code:public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 1) { 
 System.out.print(i); 
 } 
 } 
}  o/p: 0 1 2 3 4



//Snippet 10:
 
public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num = 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?
Compilation Error:ERROR!
/tmp/2H2iM6qeSN/Main.java:7: error: incompatible types: int cannot be converted to boolean
 while (num = 10) 
Ans:In this code first we initialize num to 10 then in while loop we again checking num =10  but here incompatible type  is coming because we are not comparing  num value to 10 we are just giving it to 10 
it will consider a int value not like boolean true or false .so we can use here comparision operator to num== 10 then print 10.

 correct code:public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num ==10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 

o/p: 10



//Snippet 11: 

public class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 2; // Error: This may cause unexpected results in output 
 } 
 } 
} 
o/p: 0 2 4
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the 
desired result? 
Ans: here in this code we initilize i to 0 then in while loop check 0 is less than 5 then print 0 after that that increment i to +2 then i will become 2 then again checking 2 is less than 5 then 
go inside while loop and print 2 after that increment by +2 then i will become 4 again check 4 <5 true go inside while loop print 4 after i will become 6 then check again 6<5 false we come out of the loop.



//Snippet 12: 

public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope .
Ans: Because x declare inside loop so we can not use x outside for loop .
because for loop have block level scope.In Java, variables declared inside a block (i.e., {}) are only accessible within that block.







