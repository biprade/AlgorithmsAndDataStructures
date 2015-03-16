
public class SortStackInAscendingOrder {

	public static StackImplementationWithArray sort(StackImplementationWithArray unsortedStack) throws Exception
	{
		StackImplementationWithArray sortedStack=new StackImplementationWithArray(4);
		int temp;
		while(!unsortedStack.isEmpty())
		{
			temp=unsortedStack.pop();
			while((!sortedStack.isEmpty()) && sortedStack.peek()>temp)
			{
				unsortedStack.push(sortedStack.pop());
			}
			sortedStack.push(temp);
		}
		return sortedStack;
	}
	
	public static void main(String[] args) throws Exception
	{
		StackImplementationWithArray s=new StackImplementationWithArray(4);
		s.push(4);
		s.push(1);
		s.push(3);
		s.push(2);
		s.display();
		System.out.println("After Sorting ");
		sort(s).display();
		
	}
}
