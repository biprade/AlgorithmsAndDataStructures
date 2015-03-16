
public class Bloomberg {
	//int[] input;
	int[] output;

public static void main(String[] args){
	int[] a={-4,2,-5,1,2,3,6,-1};
	Bloomberg q=new Bloomberg();
	//q.output=a.findMaxSumSubArray(a);
//	for(int i:q.output){
//		System.out.println(i);
//	}
q.findMaxSumSubArray(a);
	
}

void findMaxSumSubArray(int[] input){
	
	//implement kadagne's algorithm
	
	int current_max=0;
	int global_max=0;
	int start_index=0;
	int end_index=0;
	
	for (int i=0;i<input.length;i++){
		if (current_max<0){
			current_max=input[i];
			start_index=i;
		}
		else
			current_max+=input[i];
		
		if (current_max>global_max){
			global_max=current_max;
			end_index=i;
		}
	}
	System.out.println("Maximum sum of sub array is : "+global_max);
	for (int i=start_index;i<=end_index;i++)
		System.out.println(input[i]);
	
}
}
