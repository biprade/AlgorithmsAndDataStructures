package DynamicProgramming;

/*
 * This code is used to find the longest Palindromic Sub Sequence from the input string.
 * The sequence might not necessarily have contiguous characters in the input string.
 */
public class LongestPalindromicSubSequence {
	
public static void main(String[] args){
	String input="BBABCBCAB";
	System.out.println("Length of Longest Palindromic sub sequence is :"+findLPS(input));
	//System.out.println("Longest Palindromic sub sequence is :"+input.substring(beginIndex, endIndex));
}


static int findLPS(String input){
	
	//memoization matrix to store sub-problem results
	
	int [][] memoization=new int[input.length()][input.length()];
	
	// Fill the memoization matrix for all single length palindromes
	
	for(int i=0;i<input.length();i++)
		memoization[i][i]=1;
	
	/*The key to solve dynamic programming questions is to solve and store the overlapping
	sub problems to avoid re-computation.So we will have an outer loop to look for all possible
	lengths of palindrominc substring in the input.
	*/
	
	for(int l=2;l<=input.length();l++){
		
		/*Inner loop iterates over the entire input to check for all 
		 * palindromic sub sequence of length l
		 * i is the start pointer
		 * */
		for(int i=0;i<input.length()-l+1;i++){
			
			int j=i+l-1; //j is the end pointer
			
			if(input.charAt(i)==input.charAt(j) && l==2)
				memoization[i][j]=2;
			else if (input.charAt(i)==input.charAt(j))
				memoization[i][j]=memoization[i+1][j-1]+2;
			else
				memoization[i][j]=Math.max(memoization[i][j-1],memoization[i+1][j]);
			
		}
	}
	return memoization[0][input.length()-1];
	
	
}
}
