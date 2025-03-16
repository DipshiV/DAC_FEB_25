/*9.  Find Missing Number in an Array 
○  Given an array of size n-1 containing numbers from 1 to n,
 find the missing number.*/

public class Q08{
public class static void (String args[]){
int arr[]= {2,1,4,5,0};
System.out.println("Missing Number: " +missingNumber(arr));


}

static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        int expectedSum = (n * (n + 1)) / 2
        return expectedSum - sum;
    }
}
} 






