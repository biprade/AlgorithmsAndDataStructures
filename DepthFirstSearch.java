import java.util.ArrayList;
import java.util.List;


public class DepthFirstSearch {
	static boolean bipartite=true;
	public static void main(String[] args){
		//Preparing Graph
		
		DFSNode d1=new DFSNode(1);
		DFSNode d2=new DFSNode(2);
		DFSNode d3=new DFSNode(3);
		DFSNode d4=new DFSNode(4);
		//DFSNode d5=new DFSNode(5);
		
		d1.addNeighbour(d2);
		d1.addNeighbour(d4);
		//d2.addNeighbour(d1);
		d2.addNeighbour(d3);
		d2.addNeighbour(d4);
		//d2.addNeighbour(d5);
		//d3.addNeighbour(d1);
		d3.addNeighbour(d2);
		d3.addNeighbour(d4);
		d4.addNeighbour(d3);
		d4.addNeighbour(d1);
//		d4.addNeighbour(d5);
//		d5.addNeighbour(d2);
//		d5.addNeighbour(d4);
		
	//	doDFS(d1);
		checkBipartite(d1,0);
		//System.out.println(bipartite);
		if (bipartite){
			System.out.println("Graph is Bipartite!!!");
		}
		else
			System.out.println("Not Bipartite!!");
	}
	
	static void doDFS(DFSNode root){
		root.visited=true;
		System.out.println(root.data);
		for(int i=0;i<root.noOfNeighbours;i++){
			if(root.neighbours.get(i).visited==false)
				doDFS(root.neighbours.get(i));
		}
	}
	
	static void checkBipartite(DFSNode root,int color){
		if (root.visited==false){
			root.visited=true;
			root.color=color;
			//System.out.println(color);
		}
			for(int i=0;i<root.noOfNeighbours;i++){
				if (root.neighbours.get(i).visited==false){
					checkBipartite(root.neighbours.get(i),1-color);
				}
				else{
					if (root.neighbours.get(i).color==color){
						bipartite= false;
					//System.out.println(root.data+"->"+root.neighbours.get(i).data);
					}
				}
			}
			
			
		}
				
		
	}





class DFSNode{
	boolean visited;
	List<DFSNode> neighbours;
	int noOfNeighbours;
	int data;
	int color=-1;  //0 for red and 1 for green
	public DFSNode(int data) {
		
		this.visited=false;
		neighbours=new ArrayList<DFSNode>();
		this.data=data;
	}
	void addNeighbour(DFSNode node){
		neighbours.add(node);
		noOfNeighbours++;
	}
	
}
