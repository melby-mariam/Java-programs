package feb;

import java.util.*;
import java.io.*;
public class OddEvenFile {

	public static void main(String[] args) throws IOException {
	try {
		Scanner s=new Scanner(System.in);
		int n,i,a;
		File f=new File("number.txt");
		if(f.exists()) {
			System.out.println("number.txt already exists");
		}
		else {
			f.createNewFile();
			System.out.println("created number.txt");
		}
		FileOutputStream fos=new FileOutputStream(f);
		System.out.println("Enter the no.of inputs");
		n=s.nextInt();
		System.out.println("Enter the numbers:");
		
		for(i=0;i<n;i++) {
			a=s.nextInt();
			fos.write(a);
		}
		System.out.println("\nwritten to number.txt");
		
		File fe=new File("even.txt");
		if(fe.exists()) {
			System.out.println("even.txt already exists");
		}
		else {
			f.createNewFile();
			System.out.println("created even.txt");
		}
		File fo=new File("odd.txt");
		if(fo.exists()) {
			System.out.println("odd.txt already exists");
		}
		else {
			f.createNewFile();
			System.out.println("created odd.txt");
		}
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fs1=new FileOutputStream(fo);
		FileOutputStream fs2=new FileOutputStream(fe);
		int c;
		System.out.println("\nNumbers in number.txt:");
		while((c=fis.read())!=-1) {
			System.out.println(c);
			if(c%2==0) {
				fs2.write(c);
			}
			else {
				fs1.write(c);
			}
		}
		System.out.println("Written to odd.txt and even.txt");
		
		FileInputStream fr1=new FileInputStream(fo);
		FileInputStream fr2=new FileInputStream(fe);
		
		System.out.println("\nNumbers in odd.txt");
		while((c=fr1.read())!=-1) {
			System.out.println(c);
		}
		System.out.println("\nNumbers in even.txt");
		while((c=fr2.read())!=-1) {
			System.out.println(c);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}

	}
}
