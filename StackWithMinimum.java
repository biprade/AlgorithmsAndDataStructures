
public class StackWithMinimum extends StackImplementationWithArray {
	int min;
	StackImplementationWithArray minStack=new StackImplementationWithArray(stackSize);
	
	StackWithMinimum(int size)
	{
		super(size);
	}
	public void push(int data) throws Exception
	{
		if(top==-1)
		{
			min=data;
			minStack.push(min);
		}
		if(data<min)
		{
			min =data;
			minStack.push(min);
		}
		super.push(data);
	}
	
	public int pop() throws Exception
	{
		int returnValue=stack[top];
		if (returnValue==min)
		{
			minStack.pop();
			min=minStack.peek();
			
		}
		stack[top--]=-1;
		return returnValue;
		
		
	}
	public void displayMin()
	{
		System.out.println("Minimum "+min);
	}
}
