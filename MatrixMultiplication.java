package lab22;

import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,j,k,c1,c2,r1,r2;
		char ch;
		do {
		System.out.println("Enter the rows and coloumns of  Matrix A: ");
		r1=s.nextInt();
		c1=s.nextInt();
		int A[][]=new int[r1][c1];
		
		System.out.println("Enter the rows and coloumns of Matrix B: ");
		r2=s.nextInt();
		c2=s.nextInt();
		int B[][]=new int[r2][c2];
		
		if(c1==r2)
		{
			System.out.println("Enter the elements of Matrix A: ");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					A[i][j]=s.nextInt();
				}
			}
			System.out.println("Enter the elements of Matrix B: ");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					B[i][j]=s.nextInt();
				}
			}
				
				int Product[][]=new int[r1][c2];
				for(i=0;i<r1;i++)
				{
					for(j=0;j<c2;j++)
					{
						Product[i][j]=0;
						for(k=0;k<r2;k++)
						{
							Product[i][j]=Product[i][j]+(A[i][k]*B[k][j]);
						}
				}
			}
			System.out.println("Multiplied Matrix: ");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					System.out.print(Product[i][j]+"\t");
				}
				System.out.println("");
			}
		}
			else
			{
				System.out.println("Invalid Matrix: ");
			}
		System.out.println("Do you want to continue(y/n):");
		ch=s.next().charAt(0);
	}while(ch=='y'||ch=='Y');
		}
}
		




	


