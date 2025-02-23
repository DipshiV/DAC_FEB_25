12. Write a program to draw the following pattern:

sample:  

***** 
***** 
***** 
***** 
***** 

code:
class Main {
    public static void main(String[] args) {
       //for printing rows
        for(int i=0;i<5; i++){
       // for printing star
            for(int j=0; j<5;j++){
                System.out.print("*");
            }
      //for new line
            System.out.println();
        }
    }
}

 



13. Write a program to print the following pattern:

sample:

1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 
1

code:

class Main {
    public static void main(String[] args) {
        //for upper half
         //for row
        for(int i=1;i<=5; i++){
          // for printing  i in every columns  
            for(int j=1; j<=i;j++){
                System.out.print(i);
           //if colums value is not eqaul to last row then print star
                if(j!=i){
                System.out.print("*");
                }
            }
          //for new line
            System.out.println();
        }
        //for lower half
         for(int i=5;i>=1; i--){
        // for printing  i's value  in every columns i times
            for(int j=1; j<=i;j++){
                System.out.print(i);
                 if(j!=i){
        //if colums value is not eqaul to last row then print star
                System.out.print("*");
                }
            }
       //for new line
            System.out.println();
        }
    }
}





14. Write a program to print the following pattern: 

sample:

 * 
 ** 
 *** 
 ***** 
 ******* 
 ********* 

code:

class Main {
    public static void main(String[] args) {
        int stars = 1;
        //for row's value
        for (int i = 1; i <= 6; i++) {
         //for printing star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println(); 
       //for checking i's value if less than or equal 3 then increse stars value by othervise increase stars by two
            if (i <= 3) {
                stars++; 
            } else {
                stars += 2;
            }
        }
    }
}





15. Write a program to print the following pattern: 

sample:

     * 
    * * 
   * * * 
  * * * * 
 * * * * * 

code:

class Main {
    public static void main(String[] args) {
        int n=5;
   // for rows
        for(int i=1;i<=n; i++){
   //for printing space 
             for(int j=n; j>=i;j--){
                System.out.print(" ");
            }
   //for printing star and after star space so that it looks like pyramid
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
           
            System.out.println();
        }
         
    }
}



16. Write a program to print the following pattern


sample: 

   * 
  *** 
 ***** 
 ******* 
********* 

code:

class Main {
    public static void main(String[] args) {
        int n=5;
       //for rows
        for(int i=1;i<=n; i++){
            //for space
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
               
            }
            //for printing odd number of star
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
               
            }
           //for new line
            System.out.println();
        }
         
    }
}




17. Write a program to print the following pattern: 


sample:

  * * * * *
   * * * *
    * * *
     * *
      *


code:

class Main {
    public static void main(String[] args) {
        int n=5;
       //for rows
        for(int i=1;i<=n; i++){
       //for space
            for(int j=1; j<=i;j++){
                System.out.print(" ");
            }
          for printing star
            for(int j=n; j>=i;j--){
                System.out.print(" *");
            } 
          //for new line
            System.out.println();
        }
         
    }
}


18. Write a program to print the following pattern

sample:

   * 
  *** 
  ***** 
 ******* 
  ***** 
   *** 
    * 

code:

class Main {
    public static void main(String[] args) {
        int n = 4; // Number of rows in the upper half

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Printing spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




19. Write a program to print the following pattern

sample:

1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5

code:

class Main {
    public static void main(String[] args) {
        //for rows
        for(int i=1;i<=5; i++){
         //for printing coulms value 
            for(int j=1; j<=i;j++){
                System.out.print(j);
         //checking if columns value is not equal to rows value yhen only print star
                if(j!=i){
                System.out.print("*");
                }
            }
        //for new line
            System.out.println();
        }
         
    }
}



20. Write a program to print the following pattern: 

sample:

5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1 

code:

class Main {
    public static void main(String[] args) {
    //for rows
        for(int i=5;i>=1; i--){
        //for print columns value
            for(int j=5; j>=i;j--){
                System.out.print(j);
         //checking rows not equal to colums then print star
                if(j!=i){
                System.out.print("*");
                }
            }
            System.out.println();
        }
         
    }
}


21. Write a program to print the following pattern:

sample:

1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9  


code:

class Main {
    public static void main(String[] args) { 
    //for rows
        for(int i=1;i<=5; i++){
    //for columns value in odd numbers
            for(int j=1; j<=i;j++){
                System.out.print(2*j-1);
    //checking rows value is not equal to columns then print star
                if(j<i){
                    System.out.print("*");
                }
                
            }
      //for new line
            System.out.println();
        }
         
    }
}


22. Write a program to print the following pattern: 

sample:

********* 
 ******* 
 ***** 
 *** 
 * 
 *** 
 ***** 
 ******* 
*********

code:

class Main {
    public static void main(String[] args) {
        int n = 5; 

        // Upper inverted pyramid
        for (int i = n; i >= 1; i--) {
            // Printing spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower pyramid
        for (int i = 2; i <= n; i++) {
            // Printing spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}







23. Write a program to print the following pattern:

sample:

11111 
22222 
33333 
44444 
55555 

code:

class Main {
    public static void main(String[] args) {
    //for rows
        for(int i=1;i<=5; i++){
      //for printing columns value
            for(int j=1; j<=5;j++){
                System.out.print(i+"");
            }
       //for new line
            System.out.println();
        }
         
    }
}



24. Write a program to print the following pattern:

sample:

1 
22 
333 
4444 
55555 

code:

class Main {
    public static void main(String[] args) {
   //for rows
        for(int i=1;i<=5; i++){
   //for columns value
            for(int j=1; j<=i;j++){
                System.out.print(i+"");
            }
            System.out.println();
        }
         
    }
}




25. Write a program to print the following pattern: 

sample:

1 
12 
123 
1234 
12345 

code:

class Main {
    public static void main(String[] args) {
   //for rows
        for(int i=1;i<=5; i++){
    //for columns
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
         
    }
}



26. Write a program to print the following pattern:

sample:

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

code:

class Main {
    public static void main(String[] args) {
        int num=1;
  //for rows
        for(int i=1;i<=5; i++){
  //for columns print value          
            for(int j=1; j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
         
    }
}
