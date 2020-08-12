package linkList;

import java.util.Scanner;

class NodeUi{
	int data;
	NodeUi next;
	NodeUi(int data){
		this.data=data;
		this.next=null;
	}
}

public class UserInputLL {
	static void print(NodeUi head) {
		
		while(head!=null) {
			System.out.print(head.data+" ");
		    head=head.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int size=sc.nextInt();
			NodeUi head=new NodeUi(sc.nextInt());
			NodeUi temp=head;
			for(int i=0;i<size-1;i++) {
				temp.next=new NodeUi(sc.nextInt());
				temp=temp.next;
			}
			print(head);
			t--;
			
		}

	}

}
