 //Remove Duplicates from a Sorted Array
 class Q6 {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,9,7};
	   int i=0;
	   int j=1;
       
      while(j<arr.length){
		   if(arr[i]!= arr[j]){
			   i++;
			   arr[i]=arr[j];
			  
		   }
		   j++;
       }
	   for(int k=0;k<=i;k++){
		   System.out.print("Unique elements arr=" +arr[k]+ " ");
	   }
	   
        
    }
       
    }
	
	//Using HAshset
	
	import java.util.*;
    class Q6 {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,9,7};
	   HashSet<Integer>set= new HashSet<>();
	   for(int i=0;i<arr.length;i++){
	       set.add(arr[i]);
	   }
	   int ans[]= new int[set.size()];
	   int i=0;
	   for(int x: set){
	   ans[i++]=x;
	   }
	   for(int y: ans)
	     System.out.print(y+" ");
    }
       
    }

