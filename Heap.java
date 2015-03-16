
public class Heap {
	static int[] input={3,1,2,6,5,4,8};
public static void main(String[] args){
	
//	getMaxHeap(input);
//	for(int i=0;i<input.length;i++)
//		System.out.println(input[i]);
	
	getMinHeap(input);
	for(int i=0;i<input.length;i++)
		System.out.println(input[i]);
}

static void getMaxHeap(int[] inp){
	int lastRootIndex=(inp.length/2)-1;
	for(int i=lastRootIndex;i>=0;i--){
		maxHeapify(i);
	}
}
static void maxHeapify(int index){
	if(!(input[index]>input[2*index+1] && input[index]>input[2*index+2])){
		if(input[2*index+1]>input[2*index+2]){
			swap(index,2*index+1);
			if(2*index+1<=(input.length/2)-1)
				maxHeapify(2*index+1);
		}
		else{
			swap(index,2*index+2);
			if(2*index+2<=(input.length/2)-1)
				maxHeapify(2*index+2);
		}
		//heapify(index);
	}
	else
		return;
}
static void swap(int index,int childIndex){
	int temp=input[index];
	input[index]=input[childIndex];
	input[childIndex]=temp;
}


static void getMinHeap(int[] inp){
	int lastRootIndex=(inp.length/2)-1;
	for(int i=lastRootIndex;i>=0;i--){
		minHeapify(i);
	}
}
static void minHeapify(int index){
	if(!(input[index]<input[2*index+1] && input[index]<input[2*index+2])){
		if(input[2*index+1]<input[2*index+2]){
			swap(index,2*index+1);
			if(2*index+1<=(input.length/2)-1)
				minHeapify(2*index+1);
		}
		else{
			swap(index,2*index+2);
			if(2*index+2<=(input.length/2)-1)
				minHeapify(2*index+2);
		}
		//heapify(index);
	}
	else
		return;
}
}
