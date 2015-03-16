package DynamicProgramming;

public class LIS {
public static void main(String[] args){
	int[] input={10, 22, 9, 33, 21, 50, 41, 60, 80};
	int result=findLIS(input);
	System.out.println("LIS is : "+result);
}

static int findLIS(int[] input){
	int[] memoization=new int[input.length];
	memoization[0]=1;
	for(int i=1;i<input.length;i++){
		if(input[i]>input[i-1])
			memoization[i]=memoization[i-1]+1;
		else
			memoization[i]=memoization[i-1];
		
			
	}
	return memoization[input.length-1];
	
}
}
