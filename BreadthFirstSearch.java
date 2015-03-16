import java.util.Stack;

public class BreadthFirstSearch {
	
public static void main(String[] args){
	//Preparing Graph
	
	NodeBFS n1= new NodeBFS();
	n1.data=1;
	NodeBFS n2= new NodeBFS();
	n2.data=2;
	NodeBFS n3= new NodeBFS();
	n3.data=3;
	NodeBFS n4= new NodeBFS();
	n4.data=4;
	NodeBFS n5= new NodeBFS();
	n5.data=5;
	n1.first=n2;
	n1.second=n3;
	n3.first=n1;
	n3.second=n2;
	n3.third=n4;
	n2.first=n1;
	n2.second=n5;
	n2.third=n3;
	n2.fourth=n4;
	n4.first=n5;
	n4.second=n2;
	n4.third=n3;
	n5.first=n2;
	n5.second=n4;
	
	doBFS(n1);
	
	
}
static void doBFS(NodeBFS root){
	Queue<NodeBFS> q=new Queue<NodeBFS>();
	root.visited=true;
	q.enqueue(root);
	NodeBFS current;
	while(!q.isEmpty()){
		current=q.dequeue();
		System.out.println(current.data);
		if(current.first!=null && current.first.visited==false){
			current.first.visited=true;
			q.enqueue(current.first);
		}
		if(current.second!=null && current.second.visited==false){
			current.second.visited=true;
			q.enqueue(current.second);
		}
		if(current.third!=null && current.third.visited==false){
			current.third.visited=true;
			q.enqueue(current.third);
		}
		if(current.fourth!=null && current.fourth.visited==false){
			current.fourth.visited=true;
			q.enqueue(current.fourth);
		}
		
	}
}
	
		
		
	}

class NodeBFS{
	int data;
	NodeBFS first;
	NodeBFS second;
	NodeBFS third;
	NodeBFS fourth;
	boolean visited;
}


