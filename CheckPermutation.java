/***
 * The code checks if 2 string are permutation of each other
 * page 73 Q 1.3
 */
import java.util.Scanner;


public class CheckPermutation {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter String 1 :");
	String stringOne=in.next();
	System.out.println("Enter String 2 :");
	String stringTwo=in.next();
	CheckPermutation obj=new CheckPermutation();
	boolean result=obj.checkPermutation(stringOne,stringTwo);
	System.out.println("Is String 1 "+stringOne+" and String 2 "+stringTwo+" permuatation of each other ? :"+result);
	
		

}
private boolean checkPermutation(String stringOne,String stringTwo)
{
	int lenStringOne=stringOne.length();
	int lenStringTwo=stringTwo.length();
	boolean flag=true;
	if (lenStringOne!=lenStringTwo)
		return false;
	else{
		for (int i=0;i<lenStringOne;i++)
		{
			if (stringTwo.indexOf(stringOne.charAt(i))==-1)
				flag=false;
		}
		for (int i=0;i<lenStringTwo;i++)
		{
			if (stringOne.indexOf(stringTwo.charAt(i))==-1)
				flag=false;
		}
		
		
	}
	return flag;
}
}
