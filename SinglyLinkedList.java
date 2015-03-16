
public class SinglyLinkedList<T> {
	
private T data;
private SinglyLinkedList nextNode;

public SinglyLinkedList(T data)
{
this.data=data;	
}

public T getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}
public SinglyLinkedList getNextNode() {
	return nextNode;
}
public void setNextNode(SinglyLinkedList nextNode) {
	this.nextNode = nextNode;
}
public void addNodeToTail(T data)
{
	
	SinglyLinkedList newNode=new SinglyLinkedList(data);
	SinglyLinkedList currentNode=this;
	while(currentNode.getNextNode()!=null)
	{
		currentNode=currentNode.getNextNode();
	}
	currentNode.setNextNode(newNode);
	
	
}
public void displayList()
{
SinglyLinkedList currentNode=this;
while(currentNode!=null)
{
	System.out.print(currentNode.getData()+"--->");
	currentNode=currentNode.getNextNode();
}
}

	
}
