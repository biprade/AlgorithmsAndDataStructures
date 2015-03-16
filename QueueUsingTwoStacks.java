
public class QueueUsingTwoStacks extends StackImplementationWithArray {

	private StackImplementationWithArray newStack;
	private StackImplementationWithArray oldStack;
	public QueueUsingTwoStacks(int size) {
		// TODO Auto-generated constructor stub
		//super();
		newStack=new StackImplementationWithArray(size);
		oldStack=new StackImplementationWithArray(size);
	}
	public void push(int data) throws Exception
	{
		newStack.push(data);
	}
	public StackImplementationWithArray shiftStack() throws Exception
	{
		while(!newStack.isEmpty())
		{
			oldStack.push(newStack.pop());
		}
		return oldStack;
	}
	public int pop() throws Exception
	{
		StackImplementationWithArray s=shiftStack();
		return s.pop();
		
	}
	public int peek() throws Exception
	{
		StackImplementationWithArray s=shiftStack();
		return s.peek();
		
	}
	public static void main(String[] args) throws Exception
	{
		QueueUsingTwoStacks queue=new QueueUsingTwoStacks(3);
		queue.push(1);
		queue.push(2);
		queue.push(3);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		queue.push(4);
		queue.push(5);
		queue.push(6);
		System.out.println(queue.pop());
	}
	
}
 
