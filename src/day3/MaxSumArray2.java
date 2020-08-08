package day3;

import java.util.Scanner;

public class MaxSumArray2 {

	public static void main(String[] args) {
		// Complexity O(n)
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int k=4;
		int sum=0;
		
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		int max=sum;
		for(int i=0;i<k-1;i++) {
			sum=sum+arr[i+k]-arr[i];
			max=Math.max(max, sum);
		}
		System.out.println(max);
		
	}

}
