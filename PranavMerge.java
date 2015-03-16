public class PranavMerge {
	int[] input1;
	int[] input2;
	int[] input3;

	PranavMerge(int[] input1, int[] input2, int[] input3) {
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
		sort(input1);
		sort(input2);
		sort(input3);
	}
	void sort(int[] input)
	{
		InsertionSort is=new InsertionSort(input);
		is.sort();
	}
	int[] mergeSortedArrays()
	{
		// the output array
		int[] output =new int[input1.length+input2.length+input3.length];
		int i=0;
		int j=0;
		int k=0;
		int o=0;
		//Assuming all arrays have some elements and are not empty
		
		while(i<input1.length && j<input2.length && k<input3.length)
		{
			if(input1[i]<=input2[j] && input1[i]<=input3[k])
			{
				output[o++]=input1[i++];
			}
			else if(input2[j]<=input3[k])
			{
				output[o++]=input2[j++];
			}
			else
				output[o++]=input3[k++];
		}
		if(i==input1.length)
			mergeRest(input2,j,input3,k,output,o);
		else if(j==input2.length)
			mergeRest(input1,i,input3,k,output,o);
		else
			mergeRest(input1,i,input2,j,output,o);
		
//		while(i<=input1.length-1)
//		{
//			output[o++]=input1[i++];
//		}
//		while(j<=input2.length-1)
//		{
//			output[o++]=input2[j++];
//		}
//		while(k<=input3.length-1)
//		{
//			output[o++]=input3[k++];
//		}
		return output;
	}
	
	void mergeRest(int[] input1,int i,int[] input2,int j,int[] out,int o)
	{
		
		while(i<input1.length && j<input2.length)
		{
			if(input1[i]<=input2[j])
			{
				out[o++]=input1[i++];
			}
			else
				out[o++]=input2[j++];
		}
		while(i<input1.length)
		{
			out[o++]=input1[i++];
		}
		while(j<input2.length)
		{
			out[o++]=input2[j++];
		}
	}
	public static void main(String[] args)
	{
		int[] a={11,78,23,18};
		int[] b={5,7};
		int[] c={5,7};
		PranavMerge p= new PranavMerge(a,b,c);
		int[] out=p.mergeSortedArrays();
		for(int i=0;i<out.length;i++)
			System.out.println(out[i]);
		
	}

}
