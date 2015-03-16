/***
 * The code reverses a given input string
 * page 73 Q 1.2
 */

import java.util.Scanner;


public class StringReverse {
public static void main(String[] args)
{
	System.out.println("Enter the string to reverse : ");
	Scanner scan=new Scanner(System.in);
	String input=scan.next();
	//System.out.println(input);
	StringReverse obj=new StringReverse();
	obj.reverseString(input);
}
private void reverseString(String input)
{
	int len=input.length();
	char[] reverse=new char[len];
	for(int i=len-1;i>=0;i--)
	{
		reverse[len-1-i]=input.charAt(i);
	}
	System.out.println("Reversed string is : "+String.valueOf(reverse));
}
}
