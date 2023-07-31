package Internal;
import java.util.*;
import java.io.*;
public class FileOE {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,a,i,c;
				try {
					File fn=new File("numbers.txt");
					if(fn.exists()) {
						System.out.println("number.txt exists");
					}
					else {
						fn.createNewFile();
						System.out.println("Created new file:number.txt");
					}
					System.out.println("Enter the no.of inputs:");
					n=s.nextInt();
					FileOutputStream fs=new FileOutputStream("numbers.txt");
					System.out.println("Enter the elements:");
					for(i=0;i<n;i++) {
						a=s.nextInt();
						fs.write(a);
					}
					File fe=new File("even.txt");
					File fo=new File("odd.txt");
					if(fo.exists()) {
							System.out.println("odd.txt exists");
						}
						else {
							fn.createNewFile();
							System.out.println("Created new file:odd.txt");
						}
					if(fe.exists()) {
						System.out.println("even.txt exists");
					}
					else {
						fn.createNewFile();
						System.out.println("Created new file:even.txt");
					}
					FileInputStream fs1=new FileInputStream("numbers.txt");
					FileOutputStream fo1=new FileOutputStream("odd.txt");
					FileOutputStream fe1=new FileOutputStream("even.txt");
					System.out.println("\nNumbers in number.txt");
				while((c=fs1.read())!=-1) {
					System.out.println(c);
					if(c%2==0)
						fe1.write(c);
					else
						fo1.write(c);
				}
				FileInputStream fe2=new FileInputStream("even.txt");
				FileInputStream fo2=new FileInputStream("odd.txt");
				System.out.println("\nNumbers in even'txt");
				while((c=fe2.read())!=-1) {
					System.out.println(c);
				}
				System.out.println("\nNumbers in odd.txt");
				while((c=fo2.read())!=-1) {
					System.out.println(c);
				}	
				}
		catch(Exception e ) {
			System.out.println("File not Found");
		}

	}

}
