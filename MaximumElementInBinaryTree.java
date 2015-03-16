import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaximumElementInBinaryTree {

	public static void main(String[] args) {
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
		MaximumElementInBinaryTree m=new MaximumElementInBinaryTree();
		System.out.println(m.findFloor(root, rcl1lcl2, root).getData());
		//System.out.println(m.calculateSizeOfTree(root));
		//System.out.println(m.heightOfBinaryTree(root));
//		if(m.checkBalanced(root)==-1)
//			System.out.println(false);
//		else
//			System.out.println(true);
		
//		System.out.println("Maximum element "+m.findMax(root));
//		System.out.println("Minimum element "+m.findMin(root));
//		System.out.println("Is 12 present? "+m.findNode(root, 12));
//		System.out.println("Size of tree "+m.calculateSizeOfTree(root));
		//root.preOrderIterative(root);
//		HashMap<Integer, BinaryTree<Integer>> hm=new HashMap<Integer, BinaryTree<Integer>>();
//		root.bottomView(root, 0, hm);
		//root.rightView(root);
		//ArrayList<BinaryTree<Integer>> arr=new ArrayList<BinaryTree<Integer>>();
		//HashMap<Integer, ArrayList<BinaryTree<Integer>>> hm=new HashMap<Integer, ArrayList<BinaryTree<Integer>>>();
		//HashMap<Integer, BinaryTree<Integer>> hm=new HashMap<Integer, BinaryTree<Integer>>();
		//root.verticalSum(root, 0, hm);
		//root.topView(root, 0, hm);
//		for(Integer i:hm.keySet()){
//			System.out.print(hm.get(i).getData()+" ");
//		}
//			for(BinaryTree<Integer> j:hm.get(i))
//				System.out.print(j.getData()+" ");
//			System.out.println();
//		}
//		for(int j:hm.keySet()){
//			System.out.println(hm.get(j).getData());
//		}
		
//		List<BinaryTree<Integer>> ancestors=root.findAllAncestors(root, rcl1);
//		System.out.println(ancestors.size());
//		for(BinaryTree<Integer> node: ancestors){
//			System.out.println(node.getData());
//		}
		
		
	}
	
	public  int heightOfBinaryTree(BinaryTree<Integer> node)
	{
		if(node==null)
			return -1;
		return 1+Math.max(heightOfBinaryTree(node.getLeftChild()), heightOfBinaryTree(node.getRightChild()));
		
	}
	public int checkBalanced(BinaryTree<Integer> node)
	{
		
		if(node==null)
			return 0; //return height as 0
		int leftHeight=checkBalanced(node.getLeftChild());
//		if (leftHeight==-1)
//			return -1;
		int rightHeight=checkBalanced(node.getRightChild());
//				if (rightHeight==-1)
//					return -1;
		int heightDifference=leftHeight-rightHeight;
		if(Math.abs(heightDifference)>1)
		{
			return -1;
		}
		else
		{
			return Math.max(leftHeight, rightHeight)+1;
		}
		
		
		
	}
	class  Result
	{
		 int TreeHeight;
		 int rightTreeHeight;
		 boolean balanced;
		 Result()
		 {
			 balanced=true;
		 }
		 void setTreeHeight(int height)
		 {
			 this.TreeHeight=height;
		 }
		 void setRightTreeHeight(int height)
		 {
			 this.rightTreeHeight=height;
		 }
		 void setBalanced(boolean result)
		 {
			 this.balanced=result;
		 }
		 int getTreeHeight()
		 {
			 return TreeHeight;
		 }
		 int getRightTreeHeight()
		 {
			 return rightTreeHeight;
		 }
		 boolean getBalanced()
		 {
			 return balanced;
		 }
		
	}
	
	public int findMax(BinaryTree<Integer> node)
	{
		if (node==null)
			return Integer.MIN_VALUE;
		int lMax=findMax(node.getLeftChild());
		int rMax=findMax(node.getRightChild());
		if(lMax>=rMax && lMax>=node.getData())
			return lMax;
		else if (rMax>=node.getData())
			return rMax;
		else
			return node.getData();
	}
	
	public int findMin(BinaryTree<Integer> node)
	{
		if (node==null)
			return Integer.MAX_VALUE;
		int lMin=findMin(node.getLeftChild());
		int rMin=findMin(node.getRightChild());
		if(lMin<=rMin && lMin<=node.getData())
			return lMin;
		else if (rMin<=node.getData())
			return rMin;
		else
			return node.getData();
	}
	public boolean findNode(BinaryTree<Integer> node,int key)
	{
		if(node==null)
			return false;
		if (node.getData()==key)
			return true;
		else
		{
			boolean lresult=findNode(node.getLeftChild(),key);
			boolean rresult=findNode(node.getRightChild(),key);
			if(lresult || rresult)
				return true;
			else 
				return false;
		}
	}
	public int calculateSizeOfTree(BinaryTree<Integer> node)
	{
		
	
		if (node==null)
			return 0;
		int numLeftTreeNodes=calculateSizeOfTree(node.getLeftChild());
		int numRightTreeNodes=calculateSizeOfTree(node.getRightChild());
		return numLeftTreeNodes+numRightTreeNodes+1;
		
		
	}
	
	
		
	}

