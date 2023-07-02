package lab22;
import java.util.Scanner;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		//Author : Melby Mariam Chandy
		//Date : 23/09/22
		Scanner s=new Scanner(System.in);
		char ch;
		String str=new String(); 
		do
		{
			System.out.println("Please enter the string to check whether it is palindrome or not:");
			str=s.next();
			String rev="";
			int strLength=str.length();
			for(int i=(strLength-1);i>=0;--i)
			{
				rev=rev+str.charAt(i);
			}
				if(str.equals(rev))
				{
					System.out.println("The given string "+str+" is a palindrome");
				}
				else
				{
					System.out.println("The given string "+str+" is not a palindrome");
				}
				System.out.println("Do you want to continue(y/n):");
				ch=s.next().charAt(0);
			}while(ch=='y'||ch=='Y');
		
			s.close();
	}

}
