//#1
class First{
public static void main(String args[]){
	System.out.println("Hello");
        System.out.print("Dipshi Verma");
}
}

//#2
class Second{
public static void main(String args[]){
int a=5;
int b=7;
int sum=a+b;
System.out.print(sum);
}
}

//#3
class Third{
public static void main(String args[]){
int a=50;
int b=3;
System.out.print(a/b);
}
}

//#4
class Forth{
public static void main(String args[]){
int res1= -5 + 8 * 6;
int res2= (55 + 9) % 9;
int res3= 20 + -3 * 5 / 8;
int res4= 5 + 15 / 3 * 2 - 8 % 3;
System.out.print(res1);
System.out.print(res2);
System.out.print(res3);
System.out.print(res4);
}
}

//#5
class Fifth{
public static void main(String args[]){
int a=25;
int b=5;
int mul=a*b;
System.out.print(mul);
}
}

//#6
class Sixth{
public static void main(String args[]){
int a=125;
int b=24;
System.out.println(a +" + " + b + " = " +(a + b));
System.out.println(a +" - " + b + " = " +(a - b));
System.out.println(a +" * " + b + " = " +(a * b));
System.out.println(a +" / " + b + " = " +(a / b));
System.out.println(a +" mod " + b + " = " +(a % b));
}
}

//#7
class Seventh{
public static void main(String args[]){
int n=8;
for(int i=1; i<=10; i++){
System.out.println(n +" * " + i + " = " +n * i);
}
}
}

//#8
class Eighth{
public static void main(String args[]){
int firstNo= 10;
int secNo= 20;
int temp=firstNo;
firstNo=secNo;
secNo=temp;
System.out.println("first Number =" +firstNo);
System.out.print("Second Number =" +secNo);
}
}

//#9
class Ninth{
public static void main(String args[]){
int radious=7;
double area=3.14*7*7;
System.out.print("Area of the circle:"+area);
}
}

//#10
class Tenth{
public static void main(String args[]){
int number=15;
if(number%2 != 0){
System.out.print("Number is odd");
}
}
}

//#11
class Eleventh{
public static void main(String args[]){
int a=12;
int b=45;
int c=22;

if(a>b || a>c){
System.out.print("First Number is Largest ");
}else if(b>a || b>c){
System.out.print("Second Number is Largest");
}
else{
System.out.print("Third No is Largest");
}

}
}

//#12
class Twelth{
public static void main(String args[]){
int digit =1234;
int rev=0;
int rem; 
  
        while (digit > 0) { 
            rem = digit % 10; 
            rev = (rev * 10) + rem; 
            digit = digit / 10; 

}
System.out.print(rev);
        
}   
}

//#13
class Thirteen{
public static void main(String args[]){
int a=20;
int b=40;
int c=60;
int avg=(a+b+c)/3;
System.out.print("Average of three numbers are"+avg);
}
}

//#14
class Fourteen{
public static void main(String args[]){
int n=10;
int fib1=0;
int fib2=1;
for(int i=0;i<n;i++){
 System.out.print(fib1 + " ");
            int fib3 = fib2 + fib1;
            fib1 = fib2;
            fib2 = fib3;
}        }
}

//#15
class Fifteen{
public static void main(String args[]){
int number=5;
int res = 1; 
        for (int i = 2; i <= number; i++) 
            res *= i;
System.out.print("Factorial of 5 is"  +res); 
}
}


//#16
class Sixteen{
public static void main(String args[]){
int number=17;

            if (number % 2 != 0)
              System.out.print("Number is Prime");
             else
            System.out.print("Number is not Prime");
 

}
}

//#17
class Seventeen{
public static void main(String args[]){
int n=6;
 for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
}
}

//#18
class Eighteen{
public static void main(String[] args) 
    { 
       
        int celsius = 25;
         double fahrenheit = 0.0;
        fahrenheit = (celsius * (9/5)) + 32; 
        System.out.println(" 25°C is equal to"+ fahrenheit);
}
} 

//#19
class Ninteen{
public static void main(String args[]){
int base=3;
double power=4;
int ans=1;
while(power>=1){
 ans=ans*base;
power--;

}
System.out.print("3 raised to the power 4 is" +ans);

}
}

//#20
class Twenty{
public static void main(String args[]){
int digit=123456;
int count=0;
 while(digit != 0){
         digit = digit / 10;
         count++;
}
System.out.print("The number 123456 has " +count + " digits");

}
}




