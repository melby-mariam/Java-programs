package feb;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch;
		do {
		System.out.println("Enter string:");
		String str=new String();
		str=s.next();
		String rev="";
		 int strLength=str.length();
		for(int i=(strLength-1);i>=0;--i) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is not palindrome");
		}
		System.out.println("do you want to continue");
		ch=s.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}

	


