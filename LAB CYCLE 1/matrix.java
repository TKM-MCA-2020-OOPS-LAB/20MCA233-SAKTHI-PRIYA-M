import java.util.*;
public class matrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int i,j,row,col,flag=1;
		
		System.out.println("Enter the no of rows: ");
		row=s.nextInt();
		System.out.println("Enter the no of columns: ");
		col=s.nextInt();
		
		int[][] m = new int[row][col];
		int[][] t = new int[row][col];
		
		System.out.println("Enter the matrix elements: ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				m[i][j]=s.nextInt();
			}
		}
		System.out.println("The matrix elements are : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(m[i][j]+"\t");
			}
			System.out.println("");
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				t[i][j]=m[i][j];
			}
		}
		if(row==col)
		{
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					if(m[i][j]!=t[i][j])
					{
						flag=0;
						break;
					}
				}
					if(flag==0)
					{
						System.out.println("Matrix is not symmetric");
						break;
					}
			}
		if(flag==1)
		{
			System.out.println("Matrix is symmetric");
		}
		}
		else
		{
			System.out.println("Matrix is not symmetric");
		}
		
	}

}
