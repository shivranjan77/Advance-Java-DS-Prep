package day3;

import java.util.Scanner;

public class ReverseNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int digit=sc.nextInt();
        while(digit>0) {
        	int remainder=digit%10;
        	System.out.print(remainder);
        	digit=digit/10;
        }
	}

}
