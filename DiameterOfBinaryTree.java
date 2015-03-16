
public class DiameterOfBinaryTree {
	static DResult rs=new DResult();
	public static void main(String[] args){
		//Construct the tree
		DNode n1=new DNode(1);
		DNode n2=new DNode(2);
		DNode n3=new DNode(3);
		DNode n4=new DNode(4);
		DNode n5=new DNode(5);
		DNode n6=new DNode(6);
		DNode n7=new DNode(7);
		DNode n8=new DNode(8);
		DNode n9=new DNode(9);
		n1.leftChild=n2;
		//n1.rightChild=n3;
		n2.leftChild=n3;
		n2.rightChild=n4;
		n4.leftChild=n5;
		n4.rightChild=n6;
		n6.leftChild=n7;
		n7.rightChild=n8;
		n3.leftChild=n9;
		
		
		
		//Call the method to find diameter
		findDiameter(n1,rs);
		
		System.out.println("Diameter of tree is : "+rs.diameter);
	}
	static void findDiameter(DNode root,DResult r){
		if (root==null){
			
			r.height=0;
			r.diameter=0;
			return;
			
		}
		//System.out.println(root.leftChild.);
		findDiameter(root.leftChild,r);
		int lheight=r.height;
		int ldiameter=r.diameter;
		findDiameter(root.rightChild, r);
		
		r.diameter=Math.max(lheight+r.height+1,Math.max(ldiameter, r.diameter));
	    r.height=Math.max(lheight,r.height)+1;
	}

}
class DResult{
	int diameter;
	int height;

}
class DNode{
	int data;
	DNode leftChild;
	DNode rightChild;
	DNode(int data){
		this.data=data;
	}
	
}
