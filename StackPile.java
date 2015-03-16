import java.util.ArrayList;


public class StackPile extends StackImplementationWithArray {

	ArrayList<StackImplementationWithArray> stackpile=new ArrayList<StackImplementationWithArray>();
	int capacity;
	StackPile(int capacity)
	{
		super(capacity);
		this.capacity=capacity;
		
	}
	public void push(int data) throws Exception
	{
		
		StackImplementationWithArray currentStack=getStack("push");
		currentStack.push(data);
	
	}
	
	public int pop() throws Exception
	{
		
		StackImplementationWithArray currentStack=getStack("pop");
		//System.out.println(stackpile.size());
		return currentStack.pop();
	}
	public StackImplementationWithArray getStack(String operation) throws Exception
	{
		if (stackpile.size()==0)
			throw new StackEmptyException();
		if (stackpile.isEmpty() || (stackpile.get(stackpile.size()-1).top==capacity-1 && operation=="push"))
		{
			StackImplementationWithArray newStack=new StackImplementationWithArray(capacity);
			stackpile.add(newStack);
			//System.out.println(stackpile.get(0));
			return newStack;
		}
		if (stackpile.get(stackpile.size()-1).top==-1)
		{
			//System.out.println(stackpile.size());
			stackpile.remove(stackpile.size()-1);
			//System.out.println("hi");
			
		}
		//System.out.println("hiiiii");
		//System.out.println(stackpile.size());
		
		return stackpile.get(stackpile.size()-1);
		
	}
	
	public void display()
	{
		for (int i=0;i<stackpile.size();i++)
			{
			stackpile.get(i).display();
			System.out.println("*************");
			}
	}
	
}
