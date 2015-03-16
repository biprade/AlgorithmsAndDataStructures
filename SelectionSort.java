public class SelectionSort {
	int[] input;

	SelectionSort(int[] input) {
		this.input=input;
	}
	public void sort()
	{
		for(int i=0;i<input.length-1;i++)
		{
			//int min=input[i];
			int minPos=i;
			for(int j=i+1;j<input.length;j++)
			{
				if (input[j]<input[minPos])
				{
					//min=input[j];
					minPos=j;
				}
			}
			
			int temp=input[i];
			input[i]=input[minPos];
			input[minPos]=temp;
			
		}
	}
	public static void main(String[] args)
	{
		int[] a={5,2,6,9,0,3,1};
		SelectionSort ss=new SelectionSort(a);
		ss.sort();
		for(int i=0;i<a.length;i++)
			System.out.println(ss.input[i]);
	}
}
