package day3;

public class PalindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="heloo";
       int l=0;
       int r=str.length()-1;
       while(l<r) {
    	   if(str.charAt(l)!=str.charAt(r)) {
    		   System.out.println("not Palindrome");
    		   return;
    	   }
    	   l++;
    	   r--;
       }
       System.out.println("Palindrome");
	}

}
