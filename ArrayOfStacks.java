
public class ArrayOfStacks {
int sizeOfStack;
int[] arrayOfStacks;
int [] topArray={-1,-1,-1};

ArrayOfStacks(int size)
{
this.sizeOfStack=size;
arrayOfStacks=new int[size*3];
}
public void push (int stackNum,int data)throws Exception
{
	if (topArray[stackNum]+1>(sizeOfStack)-1)
		throw new StackFullException(stackNum);
	int index=stackNum * sizeOfStack+topArray[stackNum]+1;
	arrayOfStacks[index]=data;
	topArray[stackNum]++;
}
public int pop (int stackNum) throws Exception
{
	if(topArray[stackNum]==-1)
		throw new StackEmptyException(stackNum);
	int index=stackNum * sizeOfStack+topArray[stackNum];
	int data=arrayOfStacks[index];
	arrayOfStacks[index]=-1;
	topArray[stackNum]--;
	return data;

}

public void displayStack(int stackNum)
{
	if(topArray[stackNum]==-1)
		return;
	int startPos=stackNum*sizeOfStack;
	int endPos=stackNum*sizeOfStack+topArray[stackNum];
	for (int i=startPos;i<=endPos;i++)
		System.out.println(arrayOfStacks[i]);
	
}
class StackFullException extends Exception
{
	public StackFullException(int stackNum)
	{
		super("Stack "+stackNum+" is Full!!!");
	}

}

class StackEmptyException extends Exception
{
	public StackEmptyException(int stackNum)
	{
		super("Stack "+stackNum+" is Empty!!!");
	}

}

}
