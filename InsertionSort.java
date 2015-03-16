public class InsertionSort {
	public int[] input;

	InsertionSort(int[] input) {
		this.input = input;
	}
	
	int[] sort()
	{
		for (int i=0;i<input.length-1;i++)
		{
			
			int k=i;
			int key=input[i+1];
			while(k>=0 && key<input[k])
			{
				swap(k+1,k);
				k--;
				
			}
		}
		return input;
		
	}
	void swap(int keyPos,int replacePos)
	{
		int temp=input[replacePos];
		input[replacePos]=input[keyPos];
		input[keyPos]=temp;
	}
	public static void main(String[] args)
	{
		int[] a={8,3,1,6,9,2};
		InsertionSort is=new InsertionSort(a);
		is.sort();
		for(int i=0;i<is.input.length;i++)
			System.out.println(is.input[i]);
	}
	
}
