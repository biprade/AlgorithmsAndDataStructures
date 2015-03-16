
public class ElementsFinderFromEndOfLinkedList {
	public static void main(String[] args)
	{
		SinglyLinkedList linkedList=new SinglyLinkedList(0);
		for (int i=1;i<=5;i++)
		{
			linkedList.addNodeToTail(i);
			//System.out.println(i);
		}
		linkedList.displayList();
		findKelementfromLast(linkedList,1);
	
	}
	public static void findKelementfromLast(SinglyLinkedList list,int k)
	{
		int size=0;
		SinglyLinkedList currentNode=list;
		while(currentNode!=null)
		{
			size++;
			currentNode=currentNode.getNextNode();
		}
		int position=size-k+1;
		currentNode=list;
		int count=1;
		while(count<position)
		{
			currentNode=currentNode.getNextNode();
			count++;
			
		}
		System.out.println(k+"th to last element of the singly linked list is "+currentNode.getData());
	}
	 
}
