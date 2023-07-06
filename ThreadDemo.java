package lab22;

//import java.util.Random;
import java.util.Scanner;

class Thread11 extends Thread {
	int limit;
	public void run() {
		for(int i=0;i<limit;i++) {
			//Random r=new Random();
			//int n=r.nextInt(100);
			System.out.println("Random Number : " + n);
			if(n%2==0) {
				ThreadSquare t2=new ThreadSquare(n);
				t2.start();
			}
			else {
				ThreadCube t3=new ThreadCube(n);
				t3.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
			class ThreadSquare extends Thread {
				int num;
				ThreadSquare(int num) {
					this.num=num;
				}
				public void run() {
					System.out.println("Square of Random Number = " + (num * num) + "\n");

			}
		}
			class ThreadCube extends Thread {
				int num;
				ThreadCube(int num) {
					this.num=num;
	}
				public void run() {
					System.out.println("Cube of Random Number = " + (num * num * num) + "\n");
				}
			}
			
public class ThreadDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Thread11 t1=new Thread11();
		System.out.println("Enter the limit to generate random number:");
		t1.limit=s.nextInt();
		t1.start();
	}
}