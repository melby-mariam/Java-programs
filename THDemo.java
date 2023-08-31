package labdemo;

import java.util.Scanner;

class Table {
	public void printtable(int n) {
		
		synchronized(this) {
		for( int i=1;i<=5;i++) {
			System.out.println(n+"+"+i+"="+(n+i));
		try {
			Thread.sleep(50);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}
	}
}

 class Thread1 extends Thread {
	 int n;
	 Table t;
	Thread1(Table t) {
		this.t=t;
	}
	public void run() {
		t.printtable(n);
	}
}
 
public class THDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Table t=new Table();
		Thread1 t1=new Thread1(t);
		Thread1 t2=new Thread1(t);
		Thread1 t3=new Thread1(t);
		
		System.out.println("enter table to run by thread1");
		t1.n=s.nextInt();
		System.out.println("enter table to run by thread2");
		t2.n=s.nextInt();
		System.out.println("enter table to run by thread3");
		t3.n=s.nextInt();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
