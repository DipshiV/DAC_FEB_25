/*9.  Find Missing Number in an Array 
○  Given an array of size n-1 containing numbers from 1 to n,
 find the missing number.*/

/*
public class Q09{
int N = 5;
        int a[] = {1, 2, 4, 5};
        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
}

static int missingNumber(int[] arr, N) {
     int sum = (N * (N + 1)) / 2;
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
   
    }

} */





import java.util.*;

public class Q09 {
    public static int missingNumber(int []a, int N) {

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}





