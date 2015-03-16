
public class TestDoublyLinkedList {
public static void main(String[] args)
{
DoublyLinkedList headNode=new DoublyLinkedList();
headNode.setData(1);

DoublyLinkedList newNode=null;
for (int i=2;i<=5;i++)
{
	newNode= new DoublyLinkedList();
	newNode.setData(i);
	DoublyLinkedList.insertElement(newNode, i, headNode);
}
DoublyLinkedList.displayList(headNode);
System.out.println(DoublyLinkedList.sizeOfLinkedList(headNode));
DoublyLinkedList headNode1=DoublyLinkedList.deleteNode(4, headNode);
System.out.println(DoublyLinkedList.sizeOfLinkedList(headNode1));
DoublyLinkedList.displayList(headNode1);
DoublyLinkedList.sizeOfLinkedList(headNode1);
System.out.println(DoublyLinkedList.sizeOfLinkedList(headNode1));


}
}
