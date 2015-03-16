public class Stack<T> {
	private T data;
	private SinglyLinkedList<T> top;

	public void push(T data) {
		SinglyLinkedList<T> newNode = new SinglyLinkedList<T>(data);
		newNode.setNextNode(top);
		top = newNode;

	}

	public T pop() {
		if (top == null)
			return null;
		SinglyLinkedList<T> returnNode = top;
		top = top.getNextNode();
		returnNode.setNextNode(null); // D : is it necessary to do this step ?
		return returnNode.getData();

	}

	public T peek() {
		return top.getData();
	}

	public void display() {
		SinglyLinkedList<T> currentNode = top;
		while (currentNode != null) {
			System.out.print(currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}

	public boolean isEmpty() {
		return top==null;
	}
}
