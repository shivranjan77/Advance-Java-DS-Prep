package day3;

public class AscPrintRec {
	static void fun(int n) {
		if(n<=0) return;
		fun(n-1);
		System.out.print(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      fun(5);
	}

}
