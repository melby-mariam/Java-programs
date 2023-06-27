package lab22;

import java.io.*;
import java.util.*;
public class FileProgram {

	public static void main(String[] args) throws IOException {
		try {
		File obj1=new File("sample.txt");
		if(obj1.exists()) {
			System.out.println("sample.txt exists");
		}
		else {
			obj1.createNewFile();
			System.out.println("created sample.txt\n");
		}
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=s.nextLine();
		FileWriter f1=new FileWriter("sample.txt");
		f1.write(str);
		f1.close();
		System.out.println("Written to file sample.txt");
		
	
	File obj2=new File("new-sample.txt");
	if(obj2.exists()) {
		System.out.println("new-sample.txt exists");
	}
	else {
		obj2.createNewFile();
		System.out.println("created new-sample.txt\n");
	}
	
	FileReader f2=new FileReader("sample.txt");
	char[] content=new char[50];
	f2.read(content);
	f2.close();
	System.out.println("Content of sample.txt is: ");
	System.out.println(content);
	
	
	FileWriter f3=new FileWriter("new-sample.txt");
	f3.write(content);
	f3.close();
	System.out.println("\nCopied content from sample.txt to new-sample.txt");
	
	FileReader f4=new FileReader("new-sample.txt");
	BufferedReader br=new BufferedReader(f4);
	String c;
	System.out.println("Content of new-sample.txt is: ");
	while((c=br.readLine())!=null) {
		System.out.println(c);
	}
	
}
	catch(Exception e) {
		System.out.println("exception");
	}
}

}