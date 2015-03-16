
public class NiharAmazon {
public static void main(String[] args){
	//9 ^ 3
	int m=9;
	int n=3;
	int result=m;
	
	for (int i=2;i<=n;i++){ //this loop iterates n i.e. power no of times
		int product=0;
		for(int j=1;j<=m;j++){//this loop iterates m i.e. base no of times
			product+=result;
		}
		result=product;
	}
	System.out.println("Result is "+result);
}
}
