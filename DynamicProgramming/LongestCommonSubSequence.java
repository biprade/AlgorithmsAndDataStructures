package DynamicProgramming;
/*
 * Input: 2 strings of length m and n
 * Output: The longest common sub-sequence between the 2 strings.
 * The characters might not be contiguous but has to be present in order.
 * LCS(i,j) gives us the common substring between till first i characters of String 1
 * and first j characters of String 2.
 */

public class LongestCommonSubSequence {

	public static void main(String[] args){
	String input1="booo";
	String input2="cbovy";
	StringBuilder output=findLCS(input1,input2);
	System.out.println("LCS is : "+output);
	System.out.println("Length of LCS is : "+output.length());
}
static StringBuilder findLCS(String input1,String input2){
	
	//memoization table
	int m=input1.length();
	int n=input2.length();
	int[][] memoization=new int[m+1][n+1];
	
	//base cases
	for(int i=0;i<=m;i++){
		memoization[i][0]=0;
	}
	for(int i=0;i<=n;i++){
		memoization[0][i]=0;
	}
	
	//now prepare memoization table in a bottom-up way to find memoization[m][n]
	StringBuilder output=new StringBuilder();
	for(int i=1;i<=m;i++){
		for(int j=1;j<=n;j++){
			if (input1.charAt(i-1)==input2.charAt(j-1)){
				
			
				memoization[i][j]=1+memoization[i-1][j-1];
				output.append(input2.charAt(j-1));
			}
			else{
				memoization[i][j]=Math.max(memoization[i-1][j],memoization[i][j-1]);
				
			}
				
		}
	}
	System.out.println(memoization[m][n]);
	return output;
}
	
}
