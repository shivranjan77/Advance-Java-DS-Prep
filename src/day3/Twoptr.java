package day3;

import java.util.Scanner;

public class Twoptr {
	 static void fun(int arr[],int sum) {
	        int l=0;
	        int r=arr.length-1;
	      while(l<r){
	        	if(arr[l]+arr[r]==sum) {
	        	 	System.out.println("Exist when we add index value of "+l+"and "+r+ "that is "+arr[l]+ "and "+arr[r]);
	        	 	return;
	        	}else if(arr[l]+arr[r]<sum) {
	        		l++;
	        	}else 
	        		r--;     	
	           
	        }
	         System.out.println("not found");
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
        	arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
       fun(arr,sum);
       
	}

}
