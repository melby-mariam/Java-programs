package lab22;

import java.util.Scanner;
class Table {
public void printtable(int n) {
	synchronized(this) {
		for(int i=1;i<=5;i++)
		{
			System.out.println(n+"+"+i+"="+(n+i));
			try {
				Thread.sleep(50);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	}	
}

class Thread1 extends Thread {
	Table t;
	int n;
	Thread1(Table t)
	{
		this.t=t;
	}
	public void run()
{
	t.printtable(n);
}
}
class Thread2 extends Thread {
	Table t;
	int n;
	Thread2(Table t) {
		this.t=t;
	}
	public void run()
	{
		t.printtable(n);
	}
}
class Thread3 extends Thread {
	Table t;
	int n;
	Thread3(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printtable(n);
	}
}
public class ThreadAddition {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		Table t=new Table();
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		Thread3 t3=new Thread3(t);
		System.out.println("Enter the Table you want to run by Thread1");
		t1.n=s.nextInt();
		System.out.println("Enter the Table you want to run by Thread2");
		t2.n=s.nextInt();
		System.out.println("Enter the Table you want to run by Thread3");
		t3.n=s.nextInt();
		
		t1.start();
		t2.start();
		t3.start();
		s.close();

	}
}


	
