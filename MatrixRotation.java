
public class MatrixRotation {
public static void main(String[] args)
{
int matrixSize=4;

//Preparing the input matrix
int[][] matrix=new int[matrixSize][matrixSize];
int value=1;
for(int i=0;i<matrixSize;i++)
{
	for(int j=0;j<matrixSize;j++)
	{
		matrix[i][j]=value;
		value++;
	}
}
displayMatrix(matrix,matrixSize);
int[][] output=rotateMatrix(matrix,matrixSize);
System.out.println("After rotation by 90 degrees");
displayMatrix(output, matrixSize);

}
public static int[][] rotateMatrix(int[][] matrix,int matrixSize)
{
	int[][] outputMatrix=new int[matrixSize][matrixSize];
	int k=0;
	for(int i=matrixSize-1;i>-1;i--)
	{
		for(int j=0;j<matrixSize;j++)
		{
			outputMatrix[k][j]=matrix[j][i];
			
		}
		k++;
	}
	return outputMatrix;
}
public static void displayMatrix(int[][] matrix,int size)
{
for(int i=0;i<size;i++)
{
	for(int j=0;j<size;j++)
	{
		System.out.print(matrix[i][j]+ " ");
	}
	System.out.println();
}
}
}
