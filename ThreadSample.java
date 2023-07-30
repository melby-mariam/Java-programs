package Assignment;

class thread1 extends Thread {
public void run()
{

for(int i=1;i<=100;i++)
{
if(i%2!=0)
{
System.out.println("Thread1 : "+i);
}
}
}
}
class thread2 extends Thread {
public void run() {
	
}
{
for(int i=1;i<=100;i++)
{
if(i%2==0)
{
System.out.println("Thread 2 : "+i);
}
}
}
}
public class ThreadSample {

public static void main(String[] args) {
thread1 t1=new thread1();
thread2 t2=new thread2();
t1.setPriority(10);
t2.setPriority(9);
System.out.println("Starting thread1....");
t1.start();
System.out.println("Starting thread2....");
t2.start();

}

}