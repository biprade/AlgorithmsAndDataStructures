
public class MaxOneIn2DArray {
public static void main(String[] args){
	int[][] a=new int[4][4];
	a[0][0]=0;
	a[0][1]=0;
	a[0][2]=0;
	a[0][3]=0;
	
	a[1][0]=0;
	a[1][1]=0;
	a[1][2]=0;
	a[1][3]=1;
	
	a[2][0]=0;
	a[2][1]=0;
	a[2][2]=1;
	a[2][3]=1;
	
	a[3][0]=0;
	a[3][1]=1;
	a[3][2]=1;
	a[3][3]=1;
	boolean flag=true;
	int i=0;
	while(flag){
		for(int j=0;j<4;j++){
			if (a[j][i]==1){
				System.out.println("Row with maximum 1 "+j);
				flag=false;
				break;
			}
		}
		i++;
	}
	
}
}

