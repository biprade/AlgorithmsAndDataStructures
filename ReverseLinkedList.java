
public class ReverseLinkedList {
	public static void main(String[] args)
	{
		//preparing linked list
		SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>(0);
		list.addNodeToTail(1);
		list.addNodeToTail(2);
		list.addNodeToTail(3);
		list.addNodeToTail(4);
		list.displayList();
		System.out.println();
		Result output=reverseLinkedList(list);
		output.returnNode.setNextNode(null);
		output.head.displayList();
		
	}
	public static Result reverseLinkedList(SinglyLinkedList<Integer> node)
	{
		Result res=new Result();
		if (node.getNextNode()==null)
			
		{
			res.head=node;
			res.returnNode=node;
			return res;
		}
			
		res=reverseLinkedList(node.getNextNode());
		res.returnNode.setNextNode(node);
		res.returnNode=node;
		return res;
	
			
	}
	static class Result
	{
		SinglyLinkedList<Integer> head;
		SinglyLinkedList<Integer> returnNode;
	}
}
