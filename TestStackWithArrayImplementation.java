
public class TestStackWithArrayImplementation {
public static void main(String[] args) throws Exception
{
	
//	StackImplementationWithArray stack=new StackImplementationWithArray(3);
//	stack.push(1);
//	stack.push(2);
//	stack.push(3);
//	//stack.push(4);
//	stack.pop();
//	stack.pop();
//	stack.pop();
//	stack.pop();
//	stack.display();
	
//	StackWithMinimum minStack=new StackWithMinimum(6);
//	minStack.push(4);
//	minStack.push(8);
//	minStack.push(2);
//	minStack.push(6);
//	minStack.push(1);
//	minStack.push(5);
//	minStack.pop();
//	minStack.pop();
//	minStack.displayMin();
	
	
	StackPile s=new StackPile(3);
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);
	s.push(6);
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.display();
}
}
