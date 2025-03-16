/* Find the Second Largest Element 
○  Find the second-largest element in the given array. */

import java.util.*;
public class Q3{
	
	  int secondSmallest(int arr[], int n){
      if(n<2){
        return -1;
	  } 		
      int small=Integer.MAX_VALUE;
      int second_small=Integer.MAX_VALUE;
	  for(int i=0;i<n;i++){
	     if(arr[i]<small){
		  second_small=small;
		  small=arr[i];
		 }else if(arr[i]<second_small && arr[i]!= small){
			 second_small=arr[i];
		 }
	  }
	  
	  
	  return second_small;
	}
	
	int secondLargest(int arr[], int n){
		if(n<2){
        return -1;
	  } 
	  int max=Integer.MIN_VALUE;
        int second_max= Integer.MIN_VALUE;
	  for(int i=0;i<n;i++){
	     if(arr[i]>max){
			second_max=max;
		    max=arr[i];
		 }else if(arr[i]> second_max && arr[i] != max){
		  second_max=arr[i];
		 }
	  }
	  return second_max;
	}
	
public static void main(String args[]){	
Scanner sc= new Scanner(System.in);
System.out.print("Enter no of Elemente in an Array");
int n=sc.nextInt();
int arr[]= new int[n];
System.out.print("Enter Elementes in an Array");
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
}
Q3 obj= new Q3();

int sS=obj.secondSmallest(arr,n);
int sL=obj.secondLargest(arr,n);
System.out.println("Second smallest: " +sS);
System.out.println("Second largest: " +sL);

}
}