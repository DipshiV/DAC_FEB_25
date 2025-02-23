//SECTION 3: Lamborghini Exercise: 

1. Write a program to calculate the sum of the first 50 natural numbers. 
class Main {
    public static void main(String[] args) {
        int n=50;
        int sum=n*(n+1)/2;
        System.out.print(sum);
        
    }
}

O/P: 1275

2. Write a program to compute the factorial of the number 10. 

class Main {
    public static void main(String[] args) {
        int n=10;
        int fact=1;
        for(int i=n;i>1;i--){
            fact=fact*i;
       
        }
         System.out.print(fact);  
    }
}
 
O/P: 3628800

3. Write a program to print all multiples of 7 between 1 and 100. 

class Main {
    public static void main(String[] args) {
        for (int i = 7; i <= 100; i += 7) {
            System.out.print(i + " ");
        }  
    }
}

O/P: 7 14 21 28 35 42 49 56 63 70 77 84 91 98 


4. Write a program to reverse the digits of the number 1234. The output should be 4321
class Main {
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        while(n>0){
           int rem = n % 10; 
            rev = (rev * 10) + rem; 
            n = n / 10; 
        }
        System.out.print(rev);
     }
}

O/P: 4321


5. Write a program to print the Fibonacci sequence up to the number 21

class Main {
    public static void main(String[] args) {
       int n=21;
       int fib1=0,fib2=1;
       for(int i=0;i<n;i++){
       System.out.print(fib1+ " ");
       int fib= fib1+fib2;
       fib1=fib2;
       fib2=fib;
       }  
    }
}


6. Write a program to find and print the first 5 prime numbers.
2 3 5 7 11 
class Main {
    public static void main(String[] args) {
        int count =0;
        int num=2;
         System.out.print("The first 5 prime numbers are: ");
       
        while(count <5){
             boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(num) ;i++){
                if(num%i == 0){
                    isPrime= false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.print(num+ " ");
                count++;
            }
            num++;
            
        }
    }
}


O/P:The first 5 prime numbers are: 2 3 5 7 11 


7. Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6). 

class Main {
    public static void main(String[] args) {
        int digit =9876;
        int sum=0;
         while(digit>0){
             sum= sum+digit%10;
             digit=digit/10;
             
         }
          System.out.print(sum);
       
       
    }
}

O/P: 30

8. Write a program to count down from 10 to 0, printing each number. 

class Main {
    public static void main(String[] args) {
        for(int i=10; i>=0;i--){
            System.out.print(i+" ");
        }
       
       
    }
}
O/P: 10 9 8 7 6 5 4 3 2 1 0

9. Write a program to find and print the largest digit in the number 4825.

class Main {
    public static void main(String[] args) {
     int number = 4825;
        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10; 
            if (digit > largestDigit) {
                largestDigit = digit; 
            }
            number /= 10; 
        }
        System.out.println("The largest digit is: " + largestDigit);
    }
}
 O/P: 8


10. Write a program to print all even numbers between 1 and 50. 

class Main {
    public static void main(String[] args) {
     int n=50;
            for(int i=1; i<=n;i++){
                if(i % 2 ==0){
                   System.out.print(i+" ");  
                }
            }
    }
}

O/P: 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 




11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression 

class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = ++a + b--;
        System.out.println("result = " +result);
        System.out.println("pre increment = "+a);
        System.out.println("post-decrement = "+b);
    }
}

O/P :result = 16
pre increment = 6
post-decrement = 9


