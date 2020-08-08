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
          while(temp!=null) {
        	    
        		
        		temp=temp.next;
        		if(temp.data==7) {
        			System.out.println("value Found");
        			break;}
        			else if(temp.data!=7) {
        				System.out.println("value not Found");
            			break;
        			
        		}
        	}
          
	}
	

}
