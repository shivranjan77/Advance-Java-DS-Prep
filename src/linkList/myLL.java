package linkList;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class myLL {
	static void print(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
   static Node insertAtstart(Node head,int data) {
	   Node temp=new Node(data);
	   temp.next=head;
	   head=temp;
	   return head;
   }
   static Node insertAtend(Node head,int data) {
	   Node temp=new Node(data);
	   Node last=head;
	   while(last!=null) {
		   last=last.next;
	   }
	   last=temp;
	   return last;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Node head=new Node(5);
          head.next=new Node(6);
          head.next.next=new Node(7);
          head.next.next.next=new Node(8);
          Node temp=head;
          while(temp!=null) {
      		System.out.print(temp.data+" ");
      		temp=temp.next;
      	}
          System.out.println();
          temp=head;
          // Searching in SIngly link list
       /*   while(temp!=null) {
        	    
        		
        		temp=temp.next;
        		if(temp.data==7) {
        			System.out.println("value Found");
        			break;}
        			else if(temp.data!=7) {
        				System.out.println("value not Found");
            			break;
        			
        		}
        	}*/
        print(insertAtstart(head,4));
        print(insertAtend(head,9));
          
	}
	

}
