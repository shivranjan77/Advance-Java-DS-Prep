package day3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
		     int count=0;
		    int size1=sc.nextInt();
		    int arr1[]=new int[size1];
		    int size2=sc.nextInt();
		    int arr2[]=new int[size2];
		    
		    for(int j=0;j<size1;j++){
		        arr1[j]=sc.nextInt();
		    }
		   
		    for(int k=0;k<size2;k++){
		        arr2[k]=sc.nextInt();
		    }
		   
		   /* for(int j=0;j<size1;j++){
		        System.out.print(arr1[j]+" ");
		    }
		    
		    for(int j=0;j<size2;j++){
		        System.out.print(arr2[j]+" ");
		    }*/
		    int x =sc.nextInt();
		   for(int l=0;l<size1;l++){
		        for(int m=0;m<size2;m++){
		           int temp=arr1[l]+arr2[m];
		           //System.out.print(temp+" ");
		            if(temp==x){
		                count++;
		            }
		        }
		        
		    }
		    System.out.println(count);
		    
		}
	}

}
