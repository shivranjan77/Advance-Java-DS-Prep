package linkList;

import java.util.Scanner;

class Dll{
	int data;
	Dll next;
	Dll(int data){
		this.data=data;
		this.next=null;
	}
}
public class DeleteLL {
	static void printLL(Dll head) {
		//Dll temp=head;
		while(head!=null) {
    		System.out.print(head.data+" ");
    		head=head.next;
    	}
	}
	/*static Dll DeleteLL(Dll head) {
		head=null;
		return head;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0) {
            	int size =sc.nextInt();
            	Dll head=new Dll(sc.nextInt());
            	Dll temp=head;
            	for(int i=0;i<size-1;i++) {
            		temp.next=new Dll(sc.nextInt());
            		temp=temp.next;
            	}
            	t--;
            	printLL(head);
            	
            	System.out.println("After Deleting LL");
            	head=null;
            	printLL(head);
            }
	}

}
