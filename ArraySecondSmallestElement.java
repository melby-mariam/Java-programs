package LabPractiseQues;

import java.util.Arrays;
import java.util.Scanner;
public class ArraySecondSmallestElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=s.nextInt();
		int k;
		int arr[]=new int[limit];
		System.out.println("Enter the array elements:");
		for(int i=0;i<limit;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<limit;i++)
		{
			for(int j=0;j<limit-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("sorted array is:");
		for(k=0;k<limit;k++)
		{
			System.out.print(arr[k]+"\t");
		}
		System.out.println("\nSecond smallest element is: "+arr[1]);
	}
}

