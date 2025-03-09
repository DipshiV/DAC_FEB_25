/*Q4:  Write a program to find whether a given number is  divisible by 3  without using the 
modulus (  %  ) or division (  /  ) operators. 
Hint  : Use  subtraction and bitwise shifts  . */

import java.util.Scanner;

public class DivBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        num = (num < 0) ? -num : num; 

        while (num > 2) {
            int sum = 0;
            while (num > 0) {
                sum += num & 3; 
                num >>= 2; 
            }
            num = sum; 
			  }

        System.out.println((num == 0) ? "Divisible by 3" : "Not divisible by 3");

    }
}
