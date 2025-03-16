/*4.  Count Even and Odd Numbers 
○  Count the number of even and odd numbers in an array.*/
class Q4 {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,9,7};
       int countEven=0;
       int countOdd=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2 == 0)
            countEven++;
        else
            countOdd++;
        
          
       }
       System.out.println("count even "+countEven);
         System.out.println("count odd "+countOdd);
    }
       
    }
