package day3;

public class Recursion {
	static void fun(int n) {
		if(n>=1) {
			System.out.print(n+" ");
			fun(n-1);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fun(5);
	}

}
