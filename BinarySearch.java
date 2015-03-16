public class BinarySearch {
	int[] input;

	public BinarySearch(int[] input) {
		// TODO Auto-generated constructor stub
		this.input = input;
		sortInput();
	}
	void sortInput()
	{
		InsertionSort is=new InsertionSort(input);
		input=is.sort();
	}
	boolean search(int searchItem,int low, int high)
	{
		
		int middle=(low+high)/2;
		if(low<=high) //this is the most important criteria for termination
		{
			if (searchItem==input[middle])
				return true;
			else if(searchItem>input[middle])
			{
				return search(searchItem,middle+1,high);
			}
			else
				return search(searchItem,low,middle-1);
			
		}
		return false;
		
	}
	public static void main(String[] args)
	{
		
		int[] a={5,1,8,2,0,3};
		BinarySearch bs=new BinarySearch(a);
		for(int i=0;i<bs.input.length;i++)
			System.out.println(bs.input[i]);
		System.out.println(bs.search(8, 0, a.length));
		
	}
	
}
