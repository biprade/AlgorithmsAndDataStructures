public class BinaryTreeToDoublyLinkedList{
	static BinaryTree<Integer> head;
	static BinaryTree<Integer> current;
public static void main(String[] args){
	//Preparing Binary Search Tree
	BinaryTree<Integer> root = new BinaryTree<Integer>();
	root.setData(10);
	BinaryTree<Integer> lcl1 = new BinaryTree<Integer>();
	lcl1.setData(7);
	BinaryTree<Integer> rcl1 = new BinaryTree<Integer>();
	rcl1.setData(13);
	BinaryTree<Integer> lcl1lcl2 = new BinaryTree<Integer>();
	lcl1lcl2.setData(6);
	BinaryTree<Integer> lcl1lcr2 = new BinaryTree<Integer>();
	lcl1lcr2.setData(8);
	BinaryTree<Integer> rcl1lcl2 = new BinaryTree<Integer>();
	rcl1lcl2.setData(11);
	BinaryTree<Integer> rcl1rcl2 = new BinaryTree<Integer>();
	rcl1rcl2.setData(15);
	root.addNode(root, lcl1, "left");
	root.addNode(root, rcl1, "right");
	lcl1.addNode(lcl1, lcl1lcl2, "left");
	lcl1.addNode(lcl1, lcl1lcr2, "right");
	rcl1.addNode(rcl1, rcl1lcl2, "left");
	rcl1.addNode(rcl1, rcl1rcl2, "right");
	convertBSTtoDLL(root);
	System.out.println(head.getRightChild().getRightChild().getLeftChild().getData());
	
//	while(head!=null){
//		System.out.println(head.getData());
//		//System.out.println(head.getRightChild().getData());
//		head=head.getRightChild();
//	}
	
}
static void convertBSTtoDLL(BinaryTree<Integer> root){
	if(root==null)
		return;
	convertBSTtoDLL(root.getLeftChild());
	if(head==null){
		head=root;
		current=head;
		root.setLeftChild(null);
	}
	else{
		current.setRightChild(root);
		root.setLeftChild(current);
		current=root;
	}
	convertBSTtoDLL(root.getRightChild());
}
}
