package DynamicProgramming;

/*Problem Statement: Given a sequence of integers in an array, we need to find the length 
 * of the longest sub-sequence that has elements in ascending order.
 * NOTE: The elements might not be contiguous
 * Here, we need to find the maximum value of the memoization array in the end
*/

public class LongestIncreasingSubSequence {
	int[] input;
	public LongestIncreasingSubSequence(int[] input) {
		// TODO Auto-generated constructor stub
		this.input=input;
	}
	public static void main(String[] args){
		int [] a={2,7,3,4,9,8,12,1,56};
		LongestIncreasingSubSequence lis=new LongestIncreasingSubSequence(a);
		System.out.println(lis.findLongestIncreasingSubSequence());
	
}
	int findLongestIncreasingSubSequence(){
		int[] memoization=new int[input.length];
		for(int i=0;i<input.length;i++)
			memoization[i]=-1;
		memoization[0]=1;
		for(int i=1;i<input.length;i++){
			for(int j=i-1;j>=0;j--){
				if(input[i]>input[j] && memoization[j]+1>memoization[i])
					memoization[i]=memoization[j]+1;
			}
			if (memoization[i]==-1)
				memoization[i]=1;
		}
		return memoization[input.length-1];
	}
}
