import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BinaryTree<T> {
	private T data;
	BinaryTree<T> leftChild;
	BinaryTree<T> rightChild;
	boolean visited;
	List<BinaryTree<Integer>> ancestors=new ArrayList<BinaryTree<Integer>>();
	T depth;
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	public void setDepth(T depth){
		this.depth=depth;
	}

	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTree<T> leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTree<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTree<T> rightChild) {
		this.rightChild = rightChild;
	}

	public void preOrderTraversal(BinaryTree<T> root) {
		if (root == null)
			return;
		System.out.println(root.getData());
		preOrderTraversal(root.getLeftChild());
		preOrderTraversal(root.getRightChild());

	}

	public void inOrderTraversal(BinaryTree<T> root) {
		if (root == null)
			return;
		inOrderTraversal(root.getLeftChild());
		System.out.println(root.getData());
		inOrderTraversal(root.getRightChild());
	}

	public void postOrderTraversal(BinaryTree<T> root) {
		if (root == null)
			return;
		postOrderTraversal(root.getLeftChild());
		postOrderTraversal(root.getRightChild());
		System.out.println(root.getData());
	}

	public void levelOrderTraversal(BinaryTree<T> root) {
		if (root == null)
			return;
		Queue<BinaryTree<T>> queue = new Queue<BinaryTree<T>>();
		queue.enqueue(root);
		BinaryTree<T> temp;
		while (!queue.isEmpty()) {
			temp = queue.dequeue();
			System.out.println(temp.getData());
			if (temp.getLeftChild() != null)
				queue.enqueue(temp.getLeftChild());
			if (temp.getRightChild() != null)
				queue.enqueue(temp.getRightChild());

		}
	}

	void addNode(BinaryTree<T> currentNode, BinaryTree<T> childNode,
			String childType) {
		if (currentNode == null || childNode == null)
			return;
		switch (childType) {
		case "left":
			currentNode.setLeftChild(childNode);
		case "right":
			currentNode.setRightChild(childNode);

		}

	}
//inOrder iterative
	void inOrderIterative(BinaryTree<T> root) {
		Stack<BinaryTree<T>> stack=new Stack<BinaryTree<T>> ();
		BinaryTree<T> currentNode=root;
		pushLeftChildsOnStack(stack,currentNode);
		while(!stack.isEmpty()){
			BinaryTree<T> node=stack.pop();
			System.out.println(node.getData());
			node=node.getRightChild();
			pushLeftChildsOnStack(stack, node);
		}
		
	}

	void pushLeftChildsOnStack(Stack<BinaryTree<T>> stack,BinaryTree<T> node){
		while(node!=null){
			stack.push(node);
			node=node.getLeftChild();
		}
	}
	
//postOrder iterative
	void postOrderIterative(BinaryTree<T> root){
		BinaryTree<T> currentNode=root;
		Stack<BinaryTree<T>> stack = new Stack<BinaryTree<T>>();
		pushLeftChildsOnStackPO(stack,currentNode);
		while(!stack.isEmpty())
		{
			BinaryTree<T> node=stack.peek();
			node=node.getRightChild();
			pushLeftChildsOnStackPO(stack,node);
			node=stack.pop();
			System.out.println(node.getData());
		}
	}
	
	void pushLeftChildsOnStackPO(Stack<BinaryTree<T>> stack,BinaryTree<T> node){
		while(node!=null && node.visited==false){
			node.visited=true;
			stack.push(node);
			node=node.getLeftChild();
		}
	}
		
//pre order iterative
		void preOrderIterative(BinaryTree<T> root){
			BinaryTree<T> currentNode=root;
			Stack<BinaryTree<T>> stack=new Stack<BinaryTree<T>>();
			
			pushLeftChildsOnStackPreO(stack,currentNode);
			while(!stack.isEmpty()){
				BinaryTree<T> node=stack.pop();
				node=node.getRightChild();
				pushLeftChildsOnStackPreO(stack, node);
			}
			
		}
		void pushLeftChildsOnStackPreO(Stack<BinaryTree<T>> stack,BinaryTree<T> node ){
		while(node!=null){
			System.out.println(node.getData());
			stack.push(node);
			node=node.getLeftChild();
		}
		
		}
		void leftView(BinaryTree<Integer> root){
			if(root==null)
				return;
			int depth=0;
			Queue<BinaryTree<Integer>> q=new Queue<BinaryTree<Integer>>();
			HashMap<Integer,BinaryTree<Integer>> hm=new HashMap<Integer,BinaryTree<Integer>>();
			q.enqueue(root);
			root.setDepth(depth);
	
			hm.put(root.depth, root);
			while(!q.isEmpty()){
				BinaryTree<Integer> currentNode=q.dequeue();
				
				if(currentNode.getLeftChild()!=null){
					currentNode.getLeftChild().setDepth(currentNode.depth+1);
					if(!hm.containsKey(currentNode.getLeftChild().depth))
						hm.put(currentNode.getLeftChild().depth, currentNode.getLeftChild());
					q.enqueue(currentNode.getLeftChild());
				}
				if(currentNode.getRightChild()!=null){
					currentNode.getRightChild().setDepth(currentNode.depth+1);
					if(!hm.containsKey(currentNode.getRightChild().depth))
						hm.put(currentNode.getRightChild().depth, currentNode.getRightChild());
					q.enqueue(currentNode.getRightChild());
				}
				
			
		}
			
		
			
			for(int i:hm.keySet()){

					System.out.println(hm.get(i).getData());

			}

		}
		void verticalSum(BinaryTree<Integer> root,int hd,HashMap<Integer, ArrayList<BinaryTree<Integer>>> hm){
			if (root==null)
				return;
			ArrayList<BinaryTree<Integer>> arr;
			verticalSum(root.getLeftChild(), hd-1, hm);
//			int sum=hm.containsKey(hd)?hm.get(hd):0;
//			hm.put(hd, root.getData()+sum);
			if (hm.containsKey(hd)){
				arr=hm.get(hd);
				arr.add(root);
				
			}
				
				
			else{
				arr=new ArrayList<BinaryTree<Integer>>();
				arr.add(root);
				
			}
			hm.put(hd,arr);
			verticalSum(root.getRightChild(),hd+1,hm);
			
			
		}
		
		void topView(BinaryTree<Integer> root,int hd,HashMap<Integer,BinaryTree<Integer>> hs){
			if(root==null)
				return;
			if (!hs.containsKey(hd))
				hs.put(hd, root);
			topView(root.getLeftChild(), hd-1, hs);
			topView(root.getRightChild(), hd+1, hs);
			
			
		}
		
		void bottomView(BinaryTree<Integer> root,int hd,HashMap<Integer,BinaryTree<Integer>> hs){
			if(root==null)
				return;
			
			topView(root.getLeftChild(), hd-1, hs);
			topView(root.getRightChild(), hd+1, hs);
			if (!hs.containsKey(hd))
				hs.put(hd, root);
			
		}
		
		
		void rightView(BinaryTree<Integer> root){
			if(root==null)
				return;
			int depth=0;
			Queue<BinaryTree<Integer>> q=new Queue<BinaryTree<Integer>>();
			HashMap<Integer,BinaryTree<Integer>> hm=new HashMap<Integer,BinaryTree<Integer>>();
			q.enqueue(root);
			root.setDepth(depth);
	
			hm.put(root.depth, root);
			while(!q.isEmpty()){
				BinaryTree<Integer> currentNode=q.dequeue();
				
				if(currentNode.getLeftChild()!=null){
					currentNode.getLeftChild().setDepth(currentNode.depth+1);
					//if(!hm.containsKey(currentNode.getLeftChild().depth))
						hm.put(currentNode.getLeftChild().depth, currentNode.getLeftChild());
					q.enqueue(currentNode.getLeftChild());
				}
				if(currentNode.getRightChild()!=null){
					currentNode.getRightChild().setDepth(currentNode.depth+1);
					//if(!hm.containsKey(currentNode.getRightChild().depth))
						hm.put(currentNode.getRightChild().depth, currentNode.getRightChild());
					q.enqueue(currentNode.getRightChild());
				}
				
			
		}
			for(int i:hm.keySet()){

				System.out.println(hm.get(i).getData());

		}
		
	
	}
		

}
	
	

