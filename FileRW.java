package feb;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileRW {

	public static void main(String[] args) throws IOException {
		int c;
		Scanner s=new Scanner(System.in);
		File f=new File("sample.txt");
		if(f.exists()) {
			System.out.println("sample.txt already exists");
		}
		else {
			f.createNewFile();
			System.out.println("sample.txt created");
		}
		System.out.println("Enter the String");
		String s1=s.nextLine();
		
		FileWriter fw1=new FileWriter(f);
		fw1.write(s1);
		
		System.out.println("contents in sample.txt");
		FileReader fr1=new FileReader(f);
		char[] ch=new char[100];
		fr1.read(ch);
		ch.toString();
		System.out.println(ch);
		  
		File f1=new File("new-sample.txt");
		if(f1.exists()) {
			System.out.println("\nnew-sample.txt already exists");
		}
		else {
			f1.createNewFile();
			System.out.println("new-sample.txt created");
		}
		FileWriter fw2=new FileWriter(f1);
		fw2.write(ch);
		System.out.println("\nWritten to new-sample.txt");
		
		FileReader fr2=new FileReader(f1);
		fr2.read(ch);
		System.out.println("\nContents in new sample.txt");
		System.out.println(ch);
		
		}
	}


