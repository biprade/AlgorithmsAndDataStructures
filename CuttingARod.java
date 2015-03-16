package DynamicProgramming;

/* Problem Statement : Given data about length of rod and the price for each rod length.
 * The task is that , given an input length, find the best way to cut the rod in terms
 * of different lengths such that the resultant cost is maximum. 
 * 
 */
public class CuttingARod {
	
public static void main(String[] args){
	int[] possibleLogLengths={1,2,3,4,5,6,7,8};
	int[] lengthPrice={1,5,8,9,10,17,17,20};
	System.out.println(findBestPrice(possibleLogLengths, lengthPrice, 5));
	
}
static int findBestPrice(int[] possibleLogLengths,int[] lengthPrice,int rodLength){
	int[] memoization=new int[rodLength+1];
	for(int i=0;i<rodLength;i++)
		System.out.println(memoization[i]);
	memoization[1]=1;
	for(int i=2;i<=rodLength;i++){
		for(int j=1;j<=i;j++){
			if(lengthPrice[j-1]+memoization[i-j]>memoization[i]){
				memoization[i]=lengthPrice[j-1]+memoization[i-j];
				//System.out.println(memoization[i]);
				
			}
		}
	}
return memoization[rodLength];
}
}
