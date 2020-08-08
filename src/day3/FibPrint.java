package day3;

import java.util.Scanner;

public class FibPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if(n==0) {
        	 System.out.println("0");
         }else if(n>0) {
        	 System.out.print("0"+" ");
        	System.out.print("1"+" ");
        	 int a=0;
    		 int b=1;
        	 for(int i=2;i<=n;i++) {
        		
        		 int c=a+b;
        		 a=b;
        		 b=c;
        		 System.out.print(c+" ");
        	 }
         }
	}

}
