package feb;

import java.util.Scanner;

public class Exceptionpgm {
	

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		char choose,choice;
		int ch;
		do {
		System.out.println("Enter your choice:\n1.Arithmetic Excepion\n2.ArrayIndexOutOfBound Exception\n");
		ch=s.nextInt();
		switch(ch) {
		
		case 1: do {
			try {
			int n1,n2,div;
			System.out.println("enter number 1:");
			n1=s.nextInt();
			System.out.println("enter number 2:");
			n2=s.nextInt();
			div=n1/n2;
			System.out.println("result is "+div);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("my code is safe from exception");
			}
			System.out.println("do you want to continue(y/n):");
			choice=s.next().charAt(0);
		}while(choice=='y'||choice=='Y');
		break;
		
		case 2:
			try {
			int n,i;
			System.out.println("enter the limit of array:");
			 n=s.nextInt();
			 System.out.println("enter the array elements:");
			 int[] a=new int[n];
			 for(i=0;i<n;i++) {
				 a[i]=s.nextInt();
			 }
			 //for(i=0;i<n;i++) {
			 //System.out.println(a[i]+"\t");
			 //}
			 System.out.println("enter the position to be accessed:");
			 int position=s.nextInt();
			 System.out.println("The position is:"+a[position-1]);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			break;
		}
			System.out.println("do you want to return to main menu(y/n):");
			choose=s.next().charAt(0);
		}while(choose=='y'||choose=='y');
		}
	}

	

