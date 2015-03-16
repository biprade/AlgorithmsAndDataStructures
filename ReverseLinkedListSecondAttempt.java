
public class ReverseLinkedListSecondAttempt {
	static Vertex head;
public static void main(String[] args){
	
	//Preparing linked list
	Vertex v1=new Vertex(1);
	Vertex v2=new Vertex(2);
	Vertex v3=new Vertex(3);
	Vertex v4=new Vertex(4);
	Vertex v5=new Vertex(5);
	v1.next=v2;
	v2.next=v3;
	v3.next=v4;
	v4.next=v5;
	
	Vertex out=reverseUsingRecursion(v1);
	out.next=null;
	while(head!=null){
		System.out.println(head.data+"->");
		head=head.next;
	}
	
}

static Vertex reverseLinkedList(Vertex v){
	Vertex p=null;
	Vertex c=v;
	Vertex n=v;
	while (c!=null){
		n=c.next;
		c.next=p;
		p=c;
		c=n;
		//System.out.println(c.data);
	}
	
	return p;
}

static Vertex reverseUsingRecursion(Vertex node){
	if (node.next==null){
		head=node;
		return node;
	}
	Vertex temp=reverseUsingRecursion(node.next);
	temp.next=node;
	return node;
}
}

class Vertex{
	int data;
	Vertex next;
	Vertex(int data){
		this.data=data;
	}
}
