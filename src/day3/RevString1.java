package day3;

public class RevString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		char arr[]=str.toCharArray();
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			char temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		String rev=new String(arr);
		System.out.println(rev);
		

	}

}
