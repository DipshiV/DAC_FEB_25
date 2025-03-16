/*8.  Merge Two Sorted Arrays 
○  Merge two sorted arrays into a single sorted array without using extra space*/
import java.util.*;
public class Q10{
public static void main(String[] args){
int arr1[] = {2,1,4,5};
int arr2[] = {2,7,3,5};
int res[] = intersection(arr1,arr2);
for(int x: res){
System.out.print(" "+x);
}

}
public static int [] intersection (int[] arr1, int[] arr2){
HashSet<Integer> set = new HashSet<>();
HashSet<Integer> res = new HashSet<>();

for(int i=0; i<arr1.length; i++){
set.add(arr1[i]);
}

for(int i=0; i<arr2.length;i++){
if(set.contains(arr2[i])){
   res.add(arr2[i]);
}
}
int i=0;
int ans[] = new int[res.size()];
for(int n : res){
ans[i++]= n;

}
return ans;
}
}


public static void main(String[] args){
int arr1[] = {1,2,4,5,8};
int arr2[] = {2,3,5,6,7,9};
	ArrayList<Integer> res = union(arr1,arr2);

for(int x: res){
System.out.print(" "+x);
}

}
public static ArrayList<Integer> union(int arr1[], int arr2[]){
	int n= arr1.length;
	int m=arr2.length;
	ArrayList<Integer> list = new ArrayList<>();
	int i=0, j=0;
	while(i<n && j<m){
		if(arr1[i] <= arr2[j]){
			if(list.size() == 0 || list.get(list.size()-1) != arr1[i])
				list.add(arr1[i]);
				i++;
		}
			else{
				if(list.size()== 0 || list.get(list.size()-1)!= arr2[j])
					list.add(arr2[j]);
					j++;
					
			}
		}
		while(i<n){
			if(list.get(list.size()-1) != arr1[i]){
				list.add(arr1[i]);
				
			}i++;
			
		}
		while(j<m){
			if(list.get(list.size()-1) != arr2[j]){
				list.add(arr2[j]);
				
			}j++;
		}
		return list;
		
	}
}

