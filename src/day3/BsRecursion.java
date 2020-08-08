package day3;
import java.util.*;
public class BsRecursion {
	static int fun(int arr[],int l,int r,int x) {
		if(l>r) return -1;
		int mid = (l+r)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		else if(x>arr[mid])
		{
			return fun(arr,mid+1,r,x);
		}
		else {
			return fun(arr,l,mid-1,x);
		}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
       for(int i=0;i<size;i++) {
    	   arr[i]=sc.nextInt();
       }
       int x=sc.nextInt();
       System.out.println(fun(arr,0,arr.length-1,x));
       
	}

}
