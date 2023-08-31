package labdemo;

import java.util.Random;
import java.util.Scanner;

class SqCb extends Thread {
	int limit;
	
	public void run() {
		
		for(int i=1;i<=limit;i++) {
			
			Random r=new Random();
			int n=r.nextInt(20);
			if(n%2==0) {
				ThreadS s1=new ThreadS(n);
				s1.start();
			}
			else {
				ThreadC c1=new ThreadC(n);
				c1.start();
			}
		}
	}
}

class ThreadS extends Thread {
	int n;
	ThreadS(int n) {
		this.n=n;
	}
	public void run() {
		System.out.println("Square of "+n+" is "+(n*n)); 
	}
}

class ThreadC extends Thread {
	int n;
	ThreadC(int n) {
		this.n=n;
	}
	public void run() {
		System.out.println("Cube of "+n+" is "+(n*n*n)); 
	}
}

public class Th {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		SqCb sc=new SqCb();
		System.out.println("Enter limit to generate Random no.");
		sc.limit=s.nextInt();
		sc.start();
	}
}
