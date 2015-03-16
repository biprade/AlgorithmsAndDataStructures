
public class ReverseString {
	public static void main(String[] args)
	{
		StringBuilder input=new StringBuilder();
		input.append("Bipra");
		String output=reverseString(input);
		System.out.println("Reversed String : "+output);
	
	}
	public static String reverseString(StringBuilder input)
	{
		int i=0;
		int j=input.length()-1;
		while(i<j)
		{
			char a=input.charAt(i);
			char b=input.charAt(j);
			input.setCharAt(i,b);
			input.setCharAt(j,a);
			i++;
			j--;
		}
		return input.toString();
		
	}
}
