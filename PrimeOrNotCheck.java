package LabPractiseQues;

import java.util.Scanner;
public class PrimeOrNotCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number:");
		n=s.nextInt();	
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(n==i)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
}