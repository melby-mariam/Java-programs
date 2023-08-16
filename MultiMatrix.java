package feb;

import java.util.Scanner;

public class MultiMatrix {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch;
		int i,j,k,r1,c1,r2,c2;
		
		do {
		System.out.println("Enter rows and coloumns of matrix A:");
		r1=s.nextInt();
		c1=s.nextInt();
		int A[][]=new int[r1][c1];
		
		System.out.println("Enter rows and coloumns of matrix B:");
		r2=s.nextInt();
		c2=s.nextInt();
		int B[][]=new int[r2][c2];
		
		if(c1==r2) {
			System.out.println("Enter elements of matrix A:");
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					A[i][j]=s.nextInt();
				}
			}
			System.out.println("Enter elements of matrix B:");
			for(i=0;i<r2;i++) {
				for(j=0;j<c2;j++) {
					B[i][j]=s.nextInt();
				}
		}
			int Product[][]=new int[r1][c2];
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					Product[i][j]=0;
			for(k=0;k<r2;k++) {
					Product[i][j]=Product[i][j]+(A[i][k]*B[k][j]);
			}
		}
			}
			System.out.println("Multiplied matrix is");
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					System.out.print(Product[i][j]+"\t");
				}
				System.out.println("");
			}
		}
			else {
				System.out.println("Invalid matrix");
			}
			System.out.println("do you want to continue:");
			ch=s.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
