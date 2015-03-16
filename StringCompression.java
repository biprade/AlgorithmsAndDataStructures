
public class StringCompression {
public static void main(String[] args)
{
String input="aabbbbccccccdeeeeeaa";

String output=compressString(input);
System.out.println("Compressed String is "+output);
}

private static String compressString(String input) {
	// TODO Auto-generated method stub
	int count=0;
	String output="";
	for (int i=0;i<input.length();i++)
	{
		count=countNoOfOccurences(input.charAt(i),input);
		if(output.indexOf(input.charAt(i))==-1)
			output=output+input.charAt(i)+count;
	}
	if(output.length()>=input.length())
		return input;
	else
	{
//		System.out.println(output);
		return output;
	}
}
private static int countNoOfOccurences(char chr,String input)
{
	int count=0;
for(int i=0;i<input.length();i++)
{
if (input.charAt(i)==chr)	
	count++;
}
//System.out.println(count);
return count;
}

}
