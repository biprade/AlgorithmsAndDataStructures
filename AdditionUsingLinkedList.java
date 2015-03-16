
public class AdditionUsingLinkedList {
public static void main(String[] args)
{
SinglyLinkedList<Integer> list1 =new SinglyLinkedList<Integer>(3);
list1.addNodeToTail(2);
list1.addNodeToTail(1);
//list1.displayList();


SinglyLinkedList<Integer> list2 =new SinglyLinkedList<Integer>(9);
list2.addNodeToTail(5);
list2.addNodeToTail(4);
//list2.displayList();
SinglyLinkedList<Integer> output=addition(list1,list2,0);
output.displayList();

}

static SinglyLinkedList<Integer> addition(SinglyLinkedList<Integer> node1,SinglyLinkedList<Integer> node2,int carry){
	
	int val;
	if(node1!=null || node2!=null){
		
	if(node1==null){
		val=node2.getData()+carry;
	}
	else if(node2==null){
		val=node1.getData()+carry;
	}
	else
		val=node1.getData()+node2.getData()+carry;
	//int carry=0;
	if(val>=10)
	{
	carry=1;
	}
	else 
		carry=0;
	val=val%10;
	SinglyLinkedList<Integer> result =new SinglyLinkedList<Integer>(val);
	SinglyLinkedList<Integer> nextResult=addition(node1==null?null:node1.getNextNode(),node2==null?null:node2.getNextNode(),carry);
	result.setNextNode(nextResult);
	return result;
	}
	return null;
}
}
