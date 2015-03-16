
public class TestArrayOfStacks {
public static void main(String[] args) throws Exception
{
ArrayOfStacks stackArray=new ArrayOfStacks(3);
stackArray.push(0, 1);
stackArray.push(0, 2);
stackArray.push(0, 3);
stackArray.push(1, 4);
stackArray.push(1, 5);
stackArray.push(1, 6);
//stackArray.push(1, 7);
stackArray.push(2, 8);
stackArray.push(2, 9);
stackArray.push(2, 10);
//stackArray.push(2, 11);
stackArray.pop(2);
stackArray.pop(2);
stackArray.pop(2);
stackArray.pop(2);
stackArray.displayStack(2);

}
}
