
public class DoublyLinkedList {
private DoublyLinkedList previousNode;
private DoublyLinkedList nextNode;
private int data;

public DoublyLinkedList getPreviousNode() {
	return previousNode;
}
public void setPreviousNode(DoublyLinkedList previousNode) {
	this.previousNode = previousNode;
}
public DoublyLinkedList getNextNode() {
	return nextNode;
}
public void setNextNode(DoublyLinkedList nextNode) {
	this.nextNode = nextNode;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public static int sizeOfLinkedList(DoublyLinkedList headNode)
{
	int count=0;
	if (headNode==null)
		return 0;
	else
	{
		count=1;
		while(headNode.getNextNode()!=null)
		{
			count++;
			headNode=headNode.getNextNode();
		}
	return count;
}

}
public static int insertElement(DoublyLinkedList newNode,int position,DoublyLinkedList headNode)
{
	int size=sizeOfLinkedList(headNode);
	if(headNode==null)
		return -1;
	if (position > size+1 || position < 1)
	{
		System.out.println("Invalid position. Valid position are in the range of 1 to "+(size+1));
		return -1;
	}
	else if (position==1)
	{
		newNode.setNextNode(headNode);
		newNode.setPreviousNode(null);
		headNode.setPreviousNode(newNode);
		return position;
		
	}
	else
	{
		int count=1;
		DoublyLinkedList previousNode=headNode;
		while (count!=position-1)
		{
			previousNode=previousNode.getNextNode();
			count++;
		}

		DoublyLinkedList nextNode=previousNode.getNextNode();
		
		
		previousNode.setNextNode(newNode);
		newNode.setPreviousNode(previousNode);
		newNode.setNextNode(nextNode);
		if (nextNode!=null)
			nextNode.setPreviousNode(newNode);
		
		return position;
	}
}

public static DoublyLinkedList deleteNode(int position,DoublyLinkedList headNode)
{
	int size=sizeOfLinkedList(headNode);
	if(position < 1 || position > size)
	{
		System.out.println("Invalid position enterd. Valid positions are from 1 to "+size);
		return null;
	}
	if(position==1)
	{
		DoublyLinkedList newHeadNode=headNode.getNextNode();
		newHeadNode.setPreviousNode(null);
		headNode=null;
		System.gc();
		return newHeadNode;
	}
	else
	{
		int count=1;
		DoublyLinkedList previousNode=headNode;
		while(count!=position-1)
		{
			previousNode=previousNode.getNextNode();
			count++;
		}
		
		
		DoublyLinkedList newNextNode=previousNode.getNextNode().getNextNode();
		previousNode.setNextNode(newNextNode);
		if(newNextNode!=null)
			newNextNode.setPreviousNode(previousNode);
		return headNode;
		
	}
}
public static void deleteDoublyLinkedList(DoublyLinkedList headNode)
{
	DoublyLinkedList iterator=headNode;
	DoublyLinkedList temporaryNode;
	while(iterator!=null)
	{
		temporaryNode=iterator;
		iterator=null;
		
		iterator=temporaryNode.getNextNode();
	}

}
public static void displayList(DoublyLinkedList headNode)
{
DoublyLinkedList currentNode=headNode;
while(currentNode.getNextNode()!=null)
{
	System.out.print(currentNode.getData() + "---->");

	
	currentNode=currentNode.getNextNode();
}
System.out.println(currentNode.getData());
}

}
