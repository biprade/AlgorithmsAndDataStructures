public class MergeSort {
	int[] input;
	int[] tempArray;

	MergeSort(int[] input) {
		this.input = input;
		this.tempArray = new int[input.length]; // declared the output array of
												// same length as input array

	}

	public void mergeSort(int startPos, int endPos) {
		if (startPos < endPos) {

			int middle = (startPos +endPos)/2;// (endPos - startPos) / 2;
			mergeSort(startPos, middle);
			mergeSort(middle + 1, endPos);
			merge(startPos, middle, endPos);
		}

	}

	public void merge(int startPos, int middle, int endPos) {
		int s = startPos;
		int m = middle + 1;
		int k = startPos;
		// Now the challenge is to maintain an array common between all call
		// stacks that keeps storing the intermediate results
		// For this we are using the input array iteslf that will store the
		// intermediate results
		for (int i = startPos; i <= endPos; i++)
			tempArray[i] = input[i];
		// now we need to assume that we have got two sorted arrays in the
		// tempArray
		while (s <= middle && m <= endPos) {
			if(tempArray[s]<=tempArray[m])
			{
				input[k]=tempArray[s];
				s++;
					
			}
			else
			{
				input[k]=tempArray[m];
				m++;
			}
			k++;
		}
		
		//important part
			while(s<=middle)
			{
				//System.out.println("PPPPPP");
				input[k]=tempArray[s];
				s++;
				k++;
			}
		
	

		
}
	public static void main(String[] args)
	{
		
		int[] a={8,3,2,4,1,9,4,0};
		MergeSort ms=new MergeSort(a);
		ms.mergeSort(0, a.length-1);
		for (int i=0;i<a.length;i++)
		{
			System.out.println(ms.input[i]);
		}
	}

}
