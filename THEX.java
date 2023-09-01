package feb;


//import java.util.*;

class A extends Thread {
	int i;
	
	public void run() {
		System.out.println("\nOdd numbers b/w 1-50 are:");
		
		for(i=1;i<=50;i++) {
			
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
class B extends Thread {
	
	int i;
		
	public void run()  {
		System.out.println("\nMutiples of 10 are:");
		for(i=10;i<=200;i++) {
			
			if(i%10==0) {
				System.out.println(i);
			}
		}
	}
}

public class THEX {

	public static void main(String[] args)   {
		A a1=new A();
		B b1=new B();
		a1.setPriority(1);
		b1.setPriority(2);
		a1.start();
		b1.start();
	}
}
