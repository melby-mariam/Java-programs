package LabPractiseQues;

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,d,rev=0;
		//to read number
		System.out.println("Enter the number:");
		n=s.nextInt();
		
		//to calculate reverse number
		while(n!=0)
		{
			d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
		//to find reverse number
		System.out.println("Reverse number is: "+rev);

	}

}
