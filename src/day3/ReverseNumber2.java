package day3;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		String str=Integer.toString(value);
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		String str1=new String(ch);
		int value1=Integer.parseInt(str1);

	}

}
