
public class ReplaceSpaces {
public static void main(String[] args)
{
char[] input={'b','i',' ','p',' ','r','a',' ','d','e',' ',' ',' ',' ',' ',' ',' '};
int trueLength=10;
//Iterate over each characters of the input
for (int i=0;i<trueLength;i++)
{
//	System.out.println(input[i]);
	if(input[i]==' ')
	{
		input=shiftCharacters(input,i+1,trueLength);
		input[i]='%';
		input[i+1]='2';
		input[i+2]='0';
		trueLength=trueLength+2;
	}
}
System.out.println(input);
}
public static char[] shiftCharacters(char[] input,int position,int trueLength)
{
	for(int i=trueLength;i>=position;i--)
	{
//		System.out.println(input[i]);
		input[i+2]=input[i];
	}
	return input;
}
}
