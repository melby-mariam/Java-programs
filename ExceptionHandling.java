package lab22;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		char choose,choice='a';
		Scanner sc=new Scanner(System.in);
		int ch;
		
		do {
		System.out.println("Enter your choice\n1.Arithmeticexception\n2.Arrayindexoutofboundsexception") ;
		ch=sc.nextInt() ;
		switch(ch)
		{
		  case 1: do
		  {
		  try {
			  System.out.println("Program to perform Division");
		  int num1,num2,div;
		  System.out.print("Enter Number-1:");
		  num1=sc.nextInt();
		  System.out.print("Enter Number-2:");
		  num2=sc.nextInt();
		  div=num1/num2;
		  System.out.println("Result="+div);
		  System.out.println("End of try block");
		  }
		  catch(ArithmeticException e) {
		  System.out.println(e);
		  }
		  finally {
		  System.out.println("finally block content");
		  System.out.println("My code is safe from exception");
		  }
		  System.out.println("Do you want to continue ");
		  choice=sc.next().charAt(0);
		 
		  }while(choice=='y'||choice=='Y');
		  System.out.println("\n");
		  break;
		  case 2 : try {
		  int n;
		  System.out.println("Enter the elements you want to store : ");
		  n=sc.nextInt();
		  int[] a=new int[n];
		  System.out.println("Enter the elements of the array : ");
		  for(int i=0;i<n;i++)
		  {
		  a[i]=sc.nextInt();
		  }
		  System.out.println("Array length : "+n);
		  System.out.println("Array elements are : ");
		  for(int i=0;i<n;i++)
		  {
		  System.out.print(a[i]+" ");
		  }
		 
		  System.out.println("\nEnter the position to be accessed : ");
		  int position=sc.nextInt();
		  System.out.println("Element in "+position+" position is "+a[position-1]);
		  }
		  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("Array Index is out of Bounds");
		  }
		  break;
		  
		  } System.out.println("Do you want to return to main menu?(Y/N):");
		   choose=sc.next().charAt(0);
		} while(choose=='y'||choose=='Y');
		
		     sc.close();
		}

	}
	


