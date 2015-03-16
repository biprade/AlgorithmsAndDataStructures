import java.util.BitSet;

public class ReverseNumber {
	int input;

	ReverseNumber(int a) {
		this.input=a;
	}
	int reverseNumber()
	{
		//to calculate the length of the number
		double length=String.valueOf(input).length();
		//System.out.println(length);
		int reverse=0;
		int k=1;
		
		while(length!=0)
		{
			int a= (int) (input % (Math.pow(10, k)));
			a= (int)(a/(Math.pow(10, k-1)));
			
			reverse+= a * Math.pow(10, length-1);
			length--;
			k++;
			
			
		}
		return reverse;
	}
	
	public static void main(String[] args)
	{
		ReverseNumber inp=new ReverseNumber(12300);
		int out=inp.reverseNumber();
		System.out.println(out);
	}
}
