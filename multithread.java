package feb;

import java.util.Random;
import java.util.Scanner;

class Copy extends Thread {
	int limit;
	public void run() {
		
	for(int i=1;i<=limit;i++) {
		
		Random r=new Random();
		 int n=r.nextInt(50);
		if(n%2==0) {
			ThreadSq t2=new ThreadSq(n);
			t2.start();
		}
		else {
			ThreadCb t3=new ThreadCb(n);
			t3.start();
		}
	}
}
}
class ThreadSq extends Thread {
	int n;
	ThreadSq(int n) {
		this.n=n;
	}
	public void run() {
		System.out.println("Square of " +n+ " is :"+(n*n));
	}
}

class ThreadCb extends Thread {
	int n;
	ThreadCb(int n) {
		this.n=n;
	}
	public void run() {
		System.out.println("Cube of " +n+ " is :"+(n*n*n));
	}
}

public class multithread {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		 //int limit=s.nextInt();
		
		Copy obj=new Copy();
		obj.limit=s.nextInt();
		obj.start();
	}
}
