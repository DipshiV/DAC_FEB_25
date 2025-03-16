//1-Find Largest and smallest
public class Largest{

	Static int largest(int arr[]){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
		}
		}
		return max;
	}
	static int smallest(int arr[]){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
		if(arr[i]<min){
			min=arr[i];
		}
		}
		return min;
	
	}
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
		
				arr[i]= sc.nextInt();
			
		}
		 System.out.println(largest(arr));
		  System.out.println(smallest(arr));
		
	
}
}