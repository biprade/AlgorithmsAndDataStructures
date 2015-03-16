
public class MatrixZeroPadding {
public static void main(String[] args)
{
	int m=3;
	int n=4;

	//Preparing the input matrix
	int[][] matrix=new int[m][n];
	int value=1;
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			matrix[i][j]=value;
			value++;
		}
	}
	matrix[2][1]=0;
	matrix[2][2]=0;
	displayMatrix(matrix, m, n);
	int[][] output=zeroPadding(matrix,m,n);
	System.out.println("After Zero Padding");
	displayMatrix(output, m, n);
}
public static int[][] zeroPadding(int[][] matrix,int rows,int columns)
{
	int[][] flagForZero=new int[rows][columns];
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			if (matrix[i][j]==0)
			{
				for(int k=0;k<columns;k++)
					flagForZero[i][k]=1;
				for(int l=0;l<rows;l++)
					flagForZero[l][j]=1;
			}
		}
	}
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			if (flagForZero[i][j]==1)
				matrix[i][j]=0;
		}
	}
	return matrix;
}
public static void displayMatrix(int[][] matrix,int rows,int columns)
{
for(int i=0;i<rows;i++)
{
	for(int j=0;j<columns;j++)
	{
		System.out.print(matrix[i][j]+ " ");
	}
	System.out.println();
}
}
}
