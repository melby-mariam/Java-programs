package labdemo;

import java.util.Scanner;
import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit of array:");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		//Arrays.sort(arr);
		
		int temp;
		for(i=0;i<n;i++) {
			for(j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array elements are:");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]+"\t");
		}
		
		System.out.println("The largest element in the array is "+arr[n-1]);
		System.out.println("The smallest element in the array is "+arr[0]);
		System.out.println("The second smallest element in the array is "+arr[1]);
		System.out.println("The second largest element in the array is "+arr[n-2]);
		
	}
}
