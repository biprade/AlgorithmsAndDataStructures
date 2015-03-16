
public class Queue<T> {
	
private T data;
SinglyLinkedList<T> first;
SinglyLinkedList<T> last;
public void enqueue(T data)
{
SinglyLinkedList<T> newNode=new SinglyLinkedList<T>(data);

if(first==null)
	first=last=newNode;
else
	{
		last.setNextNode(newNode);
		last=newNode;
	}
}
public T dequeue()
{
if (first==null)
{
last=null;
return null;
}
else{
	
	SinglyLinkedList<T> returnValue=first;
	first=first.getNextNode();
	returnValue.setNextNode(null);
	return returnValue.getData();
}
}
public void display()
{
SinglyLinkedList<T> currentNode=first;
while(currentNode!=null)
{
System.out.println(currentNode.getData());
currentNode=currentNode.getNextNode();
}
}

public boolean isEmpty()
{
if (first==null)	
	return true;
return false;
}

}
