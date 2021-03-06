//Assuming both the input nodes are present in the BST
public class LCABinarySearchTree {
	static int noOfNodesPresent;
	public static void main(String[] args){
		//Construct a binary search tree
		BinaryTree<Integer> bt1=new BinaryTree<Integer>();
		bt1.setData(8);
		BinaryTree<Integer> bt2=new BinaryTree<Integer>();
		bt2.setData(6);
		BinaryTree<Integer> bt3=new BinaryTree<Integer>();
		bt3.setData(12);
		BinaryTree<Integer> bt4=new BinaryTree<Integer>();
		bt4.setData(4);
		BinaryTree<Integer> bt5=new BinaryTree<Integer>();
		bt5.setData(7);
		BinaryTree<Integer> bt6=new BinaryTree<Integer>();
		bt6.setData(10);
		BinaryTree<Integer> bt7=new BinaryTree<Integer>();
		bt7.setData(15);
		bt1.setLeftChild(bt2);
		bt1.setRightChild(bt3);
		bt2.setLeftChild(bt4);
		bt2.setRightChild(bt5);
		bt3.setLeftChild(bt6);
		bt3.setRightChild(bt7);
		
		////////////////////////////////////////////////////////////
		checkPresence(bt1,bt6,bt7);
		if(noOfNodesPresent==2)
			System.out.println(findLCA(bt1,bt6,bt7).getData());
		else if(noOfNodesPresent==1)
			System.out.println("Only one node present!! So no LCA");
		else
			System.out.println("No Node Present!!!");
			
		}
		
		
	
	static void checkPresence(BinaryTree<Integer> root,BinaryTree<Integer> node1,BinaryTree<Integer> node2){
		if (root==null)
			return;
		if (root.getData()==node1.getData()||root.getData()==node2.getData()){
			
			noOfNodesPresent++;
		}
	
		checkPresence(root.getLeftChild(),node1,node2);
		checkPresence(root.getRightChild(), node1, node2);
		
	}
	
	static BinaryTree<Integer> findLCA(BinaryTree<Integer> root,BinaryTree<Integer> node1,BinaryTree<Integer> node2){
		if(root==null)
			return null;
		if(root.getData()<node1.getData() && root.getData()<node2.getData())
			return findLCA(root.getRightChild(),node1,node2);
		else if(root.getData()>node1.getData() && root.getData()>node2.getData())
			return findLCA(root.getLeftChild(),node1,node2);
		
			return root;
			
	}

}

