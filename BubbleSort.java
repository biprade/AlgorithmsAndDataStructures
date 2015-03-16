public class BubbleSort {
	int[] input;

	BubbleSort(int[] input) {
		this.input = input;
	}
	public void sort()
	{
		
			int endPos=input.length-1;
			while (endPos>=0)
			{
				for(int i=0;i<=endPos-1;i++)
				{
					if(input[i]>input[i+1])
					{
						int temp=input[i+1];
						input[i+1]=input[i];
						input[i]=temp;
						
					}
				}
				endPos--;
					
			}
			
		
	}
	public static void main(String[] args)
	{
		int[] a={4,3,2,1,0};
		BubbleSort bs=new BubbleSort(a);
		bs.sort();
		for(int i=0;i<bs.input.length;i++)
			System.out.println(bs.input[i]);
	}

}
