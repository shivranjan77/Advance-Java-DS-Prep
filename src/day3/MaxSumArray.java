package day3;

import java.util.Scanner;

public class MaxSumArray {

	public static void main(String[] args) {
		//  Complexity O(n^2)
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
       for(int i=0;i<size;i++) {
    	   arr[i]=sc.nextInt();
       }
       int k=4;
       int max=0;
       for(int i=0;i<size-k;i++) {
    	   int sum=0;
    	   for(int j=i;j<k+i;j++) {
    		   sum=sum+arr[j];
    	   }
    	   max=Math.max(max,sum);
    	   /*if(max>sum) {
    		   max=max;
    	   }else
    		   max=sum;*/
    	   
       }
       System.out.println(max);
       
	}

}
