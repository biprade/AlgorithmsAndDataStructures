
public class ReversLinkedListInGroups {
public static void main(String[] args){

	//prepare a linked list
	RNode n1=new RNode(1);
	RNode n2=new RNode(2);
	RNode n3=new RNode(3);
	RNode n4=new RNode(4);
	RNode n5=new RNode(5);
	RNode n6=new RNode(6);
	RNode n7=new RNode(7);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=n6;
	n6.next=n7;
	
	
	//Call the method to reverse the linked list
	RNode r=reverseLinkedList(n1,2);
	while(r!=null){
		System.out.println(r.data);
		r=r.next;
	}
}

static RNode reverseLinkedList(RNode head,int k ){
	
	if(head==null){
		return null;
	}
	RNode current=head;
	RNode previous=null;
	RNode next=null;
	int count=0;
	while(current!=null && count<k){
		next=current.next;
		current.next=previous;
		previous=current;
		current=next;
		count++;
		
	}
	if(current!=null){
		head.next=reverseLinkedList(current, k);
	}
	return previous;
	
	
}
}

class RNode{
	int data;
	RNode next;
	RNode(int data){
		this.data=data;
	}
}
