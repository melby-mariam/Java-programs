package lab22;

import java.util.Scanner;

class QSort {
	public void sort(int[] a, int low, int high) {
		if(low<high) {
			int p=partition(a,low,high);
			sort(a,low,p-1);
			sort(a,p+1,high);
		}
 }
	public int partition(int a[], int low, int high) {
		int pivot=a[high];
		int i=(low-1);
		for(int j=low;j<high;j++) {
			if(a[j]<=pivot) {
				i++;
				
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		
		return i+1;
	}	
	
public void printArray(int a[]) {
	int n=a.length;
	System.out.println("The Sorted Array is:");
	for(int i=0;i<n;++i) 
		System.out.println(a[i]+" ");
		System.out.println();
	}
}

	
public class QuickSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit of the array:");
		int num=s.nextInt();
		System.out.println("Enter the array elements:");
		int a[]=new int[num];
		for(int i=0;i<num;i++) {
			a[i]=s.nextInt();
			}
		QSort q=new QSort();
			q.sort(a,0,num-1);
			q.printArray(a);
			
		}
	}

	 
			
		




		


	
	