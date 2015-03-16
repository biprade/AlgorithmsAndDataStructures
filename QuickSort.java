public class QuickSort {
	private  int[] input;

	public QuickSort(int[] input) {
		this.input = input;
	}
int partition (int p,int q)
{
	int x=input[p]; //pivot
	int i=p;
	for(int j=i+1;j<=q;j++)
	{
		if (input[j]<x)
			{
			i++;
			swap(i,j);
			}	
		
	}
	swap(p,i);
	return i;
}

void swap(int i,int j)
{
	int temp=input[j];
	input[j]=input[i];
	input[i]=temp;
}

public void sort(int i,int j)
{
	if (i<j) //remember this
	{
		int r=partition(i,j);
		sort(i,r-1);
		sort(r+1,j);
		
	}
	//System.out.println(i);
}
public static void main(String[] args)
{
int[] a={4,1,3,2,7,0};
QuickSort qs=new QuickSort(a);
//System.out.println(qs.input);
qs.sort(0, a.length-1);
for (int i=0;i<a.length;i++)
	System.out.println(qs.input[i]);
}

}
