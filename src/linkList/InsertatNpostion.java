package linkList;
class node1{
	int data;
	node1 next;

  node1(int data){
  this.data=data;
  this.next=null;
}
}
public class InsertatNpostion {
	static void print(node1 head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	static node1 insertion(node1 head,int pos,int data) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		if(pos>=count) {
		    System.out.println("Enter valid Position");
			return head ;
		}
		if(pos==1) {
			node1 newnode1=new node1(data);
			newnode1.next=head;
			return newnode1;
		}
		node1 newnode1=new node1(data);
		node1 last=head;
		for(int i=0;i<pos-2;i++) {
			last=last.next;
			
		}
		newnode1.next=last.next;
		last.next=newnode1;
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          node1 head=new node1(5);
          head.next=new node1(6);
          head.next.next=new node1(7);
          //head=insertion(head,8);
         print(insertion(head,5,8));
        
          
	}

}
