// Find Sum and Average 
class Q5 {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,9,7};
       int sum=0;
       int average=0;
      
       for(int i=0;i<arr.length;i++){
       sum=sum+i;
       }
       average=sum/arr.length;
       System.out.println("Sum= "+sum);
        System.out.println("Average= "+average);
    }
       
    }
