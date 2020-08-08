package sorting;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int arr[]=new int[size]; 
         for(int i=0;i<size;i++) {
        	 arr[i]=sc.nextInt();
         }
         int x=sc.nextInt();
         int left=0;
         int right=size-1;
         while(left<=right) {
        	 int mid=(left+right)/2;
        	 if(arr[mid]==x) {
        		 System.out.println("Element found at Index : "+arr[mid]);
        		 return;
        	 }else if(arr[mid]>x) {
        		 right=mid-1;
        	 }else
        		 left=mid+1;
         }
        System.out.println("Not Found"); 
	}

}
