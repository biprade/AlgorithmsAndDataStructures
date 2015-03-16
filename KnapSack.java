package DynamicProgramming;

/*KnapSack problem has an input array of weights and their corresponding price/benefits.
given an input max weight of M, we have to find the combination of weights we can put in the bag such that benefit is max.
We need to create a memoization array of n x w where n is the number of weights and w is the number of columns = maximum weight 

*/
public class KnapSack {
public static void main(String[] args){
	int[] weights={2,4,7,5,6};
	int[] benefits={1,5,3,4,4};
	int maxWeight=10;
	
	System.out.println("Maximum Benefit for the max weight "+maxWeight+" is : "+findMaxBenefit(weights,benefits,maxWeight));
	
}

static int findMaxBenefit(int []weights,int[] benefits,int maxWeight){
	//Memoization table to store sub-problems results
	int[][] memoization=new int[weights.length+1][maxWeight+1];
	
	//B(0,W)=0;
	for(int i=0;i<=maxWeight;i++){
		memoization[0][i]=0;
	}
	//B(i,0)=0;
	for(int i=0;i<=weights.length;i++)
		memoization[i][0]=0;
	
	//need to find B(i,W) i.e. memoization(weights.length,maxWeight)
	for(int i=1;i<=weights.length;i++){
		for(int w=1;w<=maxWeight;w++){
			if(weights[i-1]>w)
				memoization[i][w]=memoization[i-1][w];
			else if(weights[i-1]<=w){
				//2 possibilities
				memoization[i][w]=Math.max(memoization[i-1][w],benefits[i-1]+memoization[i-1][w-weights[i-1]] );
			
		}
		}
	}
	return memoization[weights.length][maxWeight];
}
}
