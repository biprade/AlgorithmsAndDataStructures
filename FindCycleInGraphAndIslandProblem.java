import java.util.ArrayList;
import java.util.List;


public class FindCycleInGraphAndIslandProblem {
public static void main(String[] args){
	int noOfVertices=0;
	List<NodeDFS> listOfVertices=new ArrayList<NodeDFS>();
	int noOfIslands=0;
	NodeDFS n1=new NodeDFS(1);
	NodeDFS n2=new NodeDFS(2);
	NodeDFS n3=new NodeDFS(3);
	NodeDFS n4=new NodeDFS(4);
	NodeDFS n5=new NodeDFS(5);
	n1.addNeighbour(n2);
	n2.addNeighbour(n3);
	//n3.addNeighbour(n1);
	n4.addNeighbour(n5);
	listOfVertices.add(n1);
	listOfVertices.add(n2);
	listOfVertices.add(n3);
	listOfVertices.add(n4);
	listOfVertices.add(n5);
	for(int i=0;i<listOfVertices.size();i++){
		//System.out.println("TT");
		if(listOfVertices.get(i).visited==false){
			//System.out.println(noOfIslands);
			doDFS(listOfVertices.get(i));
			noOfIslands++;
			
		}
	}
	System.out.println(noOfIslands);
	
	
}
static void doDFS(NodeDFS root){
	root.visited=true;
	for(int i=0;i<root.noOfNeighbours;i++){
		
		if(!root.neighbours.get(i).visited){
			doDFS(root.neighbours.get(i));
		}
		else{
			if (root.neighbours.get(i).data!=root.data)
				System.out.println("Loop Detected!!!");
		}
	}
}

}

class NodeDFS{
	boolean visited=false;
	List<NodeDFS> neighbours;
	int noOfNeighbours;
	int data;
	NodeDFS(int data){
		this.data=data;
		neighbours=new ArrayList<NodeDFS>();
	}
	void addNeighbour(NodeDFS node){
		neighbours.add(node);
		noOfNeighbours++;
	}
	
}
