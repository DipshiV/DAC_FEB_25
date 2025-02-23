//Snippet 1: 

public class NestedLoopOutput { 
 public static void main(String[] args) { 
 for (int i = 1; i <= 3; i++) { 
 for (int j = 1; j <= 2; j++) { 
 System.out.print(i + " " + j + " "); 
 } 
 System.out.println();
}
}
}

// Guess the output of this nested loop. 

Ans:  Here in this code first outer loop will excute then we will enter innner loop So,
first iteration:
1 step: i=1 then j=1  and it will print 1 1
2 step:i=1 then j increment by one so it will print again i and j's value . 1 2
and j's value increment by 1 and condition is going to be false.so we are out of the inner loop. 
for i=1 it will print 1 1 1 2
and we move next line

Second Iteration:
1 step : Increment i's value 1 to 2 so for i=2 
we enter inside inner loop and we are checking j=1 so it will print 2 1
step 2: for i=2 increment j by one so j=2 it will print 2 2
Step 3: As we have j=3 so condition will be false 3<=2 is false so we exit from inner loop
so it will like this 2 1 2 2 

Third Iteration:
1 step: Increment i's value 2 to 3 so for i=3
we enter inside inner loop and we are checking  j=1 so it will print 3 1
Step 2: increment j's value 1 to 2 checking condition it is true then print 3 2
Step 3: increment j's value to 2 to 3 and condition will be false so we are out of the inner loop.
so it will print 3 1 3 2

So Output of the code is:
1 1 1 2 
2 1 2 2 
3 1 3 2 



//Snippet 2: 
public class DecrementingLoop { 
 public static void main(String[] args) { 
 int total = 0; 
 for (int i = 5; i > 0; i--) { 
 total += i; 
 if (i == 3) continue; 
 total -= 1; 
 } 
 System.out.println(total); 
 } 
} 
// Guess the output of this loop. 


Ans:So in this we took a total name variable initilize to 0
step 1: Here in for loop initialze i=5 and check 5>0 true. 
Go to second line add i's value in total so total becomes 5 now .
Go to the third line we are checkinf if i's value is 3 then skip next step(Because of continue when we continue it skips next line). 
but here i's value is 5 so we got next line and decrement
total value to 1 so total here is 4

step 2: Here i value will become 4 so check conditon 4>0 true.
 Go to the next line add 4 into total so total will becomes 4+4=8.
Then go to next line check i's value it is 4 so go to next line decrement 1 into total total will becomes 7.

step 3: So here i will become 3 .check condition 3>0 true .
Go to next line add 3 into total it will become 7+3=10.
Go to next line it will check i==3 condtion is true ,skip next step .

step 4: So here i will become 2 check conditon 2>0 true .
So go to the next line add 2 into total 10+2=12.
Go to next line check condition for i it is false go to next line decrement total by 1 so total will become 11.

step 4:So here i = 1 check condition 1>0 true
 So go to the next line add 1 into total  will become 11+1=12. 
Go to the next line check condition for i it will false 
So go to the next line decrement total value by 1 total will become 11.

step 5: here i's value equal to 0 so 0>0 false so we are out of the loop.
and print output:
o/p:
Total value is :11

Explanation:
The loop starts with i = 5 and goes down to i = 1.
At each step, it adds the current value of i to total.
If i == 3, it skips the subtraction step because of the continue statement.
For all other values of i, it subtracts 1 from total after adding i.


//Snippet 3: 

public class WhileLoopBreak { 
 public static void main(String[] args) { 
 int count = 0; 
 while (count < 5) { 
 System.out.print(count + " "); 
 count++; 
 if (count == 3) break; 
 } 
 System.out.println(count); 
 } 
} 
// Guess the output of this while loop. 


Ans:So in this code first we took a variable count and initialize to 0

Step 1:.Then we go to next line in while loop we check 0<5 true  go to the next line and print 0.
 Go to the next line increment count by 1 count will become now 1 .
Go to the next line and check if count == 3 false .so go back to while loop

Step 2:  

this time count is 1 check condtion  1<5 true go to the next line print 1 .
Go to the next line and increment count by 1 so count will become 2 
Go to the next line again checking count is equal to 3 false go back to while loop.

step 3:

Now count is 2 so check is 2<5 yes true go to the next line print 2 .
Go to the next line again increment count by 1 count value will become 3 .
Go to the next line checking is count == 3 yes true we are out of the loop.

step 4: after while there is a print statement for count so now count is 3 . 
So final output will be: 
 0 1 2 3


//Snippet 4:
 
public class DoWhileLoop { 
 public static void main(String[] args) { 
 int i = 1; 
 do { 
 System.out.print(i + " "); 
 i++; 
 } while (i < 5); 
 System.out.println(i); 
 } 
} 
// Guess the output of this do-while loop. 

Ans: In this code we are using do while loop we took a variable i and inialize it to 1.

Step 1:
first we go in do line enter into do while loop.
first print i's value which is initially 1.
Go to the next line and increment i's value to 1 ,i will become 2.
Check condition it is true (2<5).

Step 2: 
Go back to the again do line print i's value which is 2.
Go to the next line increment i by 1, i will become 3 .
Go to the next line check condition is 3<5 true go back to the loop.

Step 3:
Again do print i's value which is 3. 
Go to the next line increment i by 1 , i will become 4.
Go to the next line check condition is 4<5 true go back to the loop.

Step 4:
Again go to the do print i's value which is 4 .
Go to the next line increment i by 1 , i will become 5.
Go to the next line check condition ,is 5<5 false we are out of the loop .
after loop we have print statement for i in same line  we have to print i's value which is 5.

so final output will be:
1 2 3 4 5

Explanation:
 do-while loop always runs at least once because the condition is checked after the loop body executes.
It starts printing from i = 1 to i = 4.
When i becomes 5, the loop ends because i < 5 is false.
After the loop ends, System.out.println(i); prints 5 on a new line.


//Snippet 5: 

public class ConditionalLoopOutput { 
 public static void main(String[] args) { 
 int num = 1; 
 for (int i = 1; i <= 4; i++) { 
 if (i % 2 == 0) { 
 num += i; 
 } else { 
 num -= i; 
 } 
 } 
 System.out.println(num); 
 } 
} 
// Guess the output of this loop. 

Ans:first took a variable num initialize it to 1.
Step 1: first Iteration
 Go to the for loop where i=1 check is 1<=4 yes true .
Go to next line check  if 1%2 == 0 No go to else part .
And decrement num value by i's value so num will become (1-1=0).

Step 2:
In second Iteration i's value will become 2 check is 2<=4 yes go to the next line.
Check 2%2 =0 true then add i's value into num so num will become (0+2=2).

Step 3:
In third Iteration i's value will become 3 then check is 3<=4 true go to the next line.
check 3%2 ==0 false go to the else part and decrease num value by i's value, num will become (2-3=-1).

Step 4:
 In fourth Iteration again check is 4<=4 yes its equal so go to the next line.
Check 4%2 ==0 yes true increase num value by i's value num will become (1+4=3).

Step5: In fifth Iteration check i's value 5<=4 false so we are out of the loop. after loop we have 
SOP statement to print num value which is 3.

so output is :3

Explanation:
The loop runs from i = 1 to i = 4.
If i is even, it adds i to num.
If i is odd, it subtracts i from num.
The final result of num after all iterations is 3.


//Snippet 6: 

public class IncrementDecrement { 
 public static void main(String[] args) { 
 int x = 5; 
 int y = ++x - x-- + --x + x++; 
 System.out.println(y); 
 } 
} 
// Guess the output of this code snippet.

Ans:Here in this code we took a variable x initialize it to 5.
Step 1:
we took a second variable y and here 
++X: X=6(Preincrement means first increase then assign so x will be 6)
X--: X=6(Postdecrement means first assign value then decrease so here after assigning x will be 5)
--X: x=4(Predecrement means first decrease the assign so x will be 4 )
X++ :x=4(PostIncreement so here x is 4 after increment it will be 5 )
So final expression is: 6-6+4+4=8

Output:8

//Snippet 7: 

public class NestedIncrement { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = ++a * b-- - --a + b++; 
 System.out.println(result); 
 } 
} 
// Guess the output of this code snippet.

Ans: In this code first we took two variable a which is initialize to 10 and b which is initilize to 5.
++a: a=11 (first increment then assign a will be 11)
b--:b=5 (first assign b's value then decrease by 1 so b will be 4)
--a: a=10 (Now first decrease a 11 to 10 then assign it to a which is 10)
b++: b=4 (here first assign 4 to b then increase 4 to 5)

So final Expression Is: ++a * b-- - --a + b++; 
11*5-10+4 =55-10+4=45+4=49
Output: 49


//Snippet 8: 

public class LoopIncrement { 
 public static void main(String[] args) { 
 int count = 0; 
 for (int i = 0; i < 4; i++) { 
 count += i++ - ++i; 
 } 
 System.out.println(count); 
 } 
} 
// Guess the output of this code snippet.


Ans: So here in this code first we took a variable count initialize it to 0 .
step 1:
we go inside for loop  we are checking is i's value is less than 4 (0<4) true then
Go to the next line in count variable we have to add i's value in count variable
i++: i=0 (after post increment i will be 1)
++i : i=1(first increase i's value by 1 then assign it to i which is 1)
so count = 0+1-1=0

Step 2:
We again check i's value is 1 <4 true go inside for loop 
i++: i=1 (after post increment i will be 2)
++i : i=2(first increse i's value by 1 then assign it to i which is 2)
calculate count = 0+1-2=-1

Step 3:
 We again check i's value is 2 <4 true go inside for loop 
i++: i=2 (after post increment i will be 3)
++i : i=3(first increse i's value by 1 then assign it to i which is 3)
calculate count = -1+2-4=-3

Step 3:
 We again check i's value is 3 <4 true go inside for loop 
i++: i=3 (after post increment i will be 4)
++i : i=4(first increse i's value by 1 then assign it to i which is 4)
calculate count = -3+3-4=-4

Step 3:
 we again check i's value is 4 <4 false we are out of the loop and print count value which is
-4 
output= -4






 


            













