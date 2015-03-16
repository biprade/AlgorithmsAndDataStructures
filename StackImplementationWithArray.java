
public class StackImplementationWithArray {
int top=-1;
int stackSize;
int[] stack;

StackImplementationWithArray(int stackSize)
{
	this.stackSize=stackSize;
	stack=new int[stackSize];
}
public StackImplementationWithArray() {
	// TODO Auto-generated constructor stub
}

public void push(int data) throws Exception
{
	if(top==stackSize-1)
		throw new StackOverflowException();
	stack[++top]=data;

}
public int pop() throws Exception
{
	if(top==-1)
		throw new StackEmptyException();
	int returnValue=stack[top];
	stack[top--]=-1;
	return returnValue;
}

public int peek() throws Exception
{
	if(top==-1)
		throw new StackEmptyException();
	return stack[top];
}
public void display()
{
	for(int i=top;i>=0;i--)
		System.out.println(stack[i]);
}
public boolean isEmpty()
{
return top==-1;	
}

class StackOverflowException extends Exception
{
public StackOverflowException() {
	// TODO Auto-generated constructor stub
	super("Stack Overflow!!!");
}	

}

class StackEmptyException extends Exception
{
public StackEmptyException() {
	// TODO Auto-generated constructor stub
	super("Stack Empty...Can't pop tarts!!!");
}	

}
}
