import java.util.*;

public class Q2 {
    public static void reverseArray(int arr[], int n) {
        int left = 0, right = n - 1;
        while (left < right) {
           
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        reverseArray(arr, n);

     
        System.out.println("Reversed array: " + Arrays.toString(arr));
        
        sc.close();
    }
}
