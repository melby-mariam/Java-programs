package lab22;

import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		//Author : Melby Mariam Chandy
		//Date:23/09/22
		System.out.println("Enter the String:");
		Scanner s=new Scanner(System.in);
		String msg=new String();
		int count=0;
		msg=s.nextLine();
		String msgCopy=msg.toLowerCase();
		System.out.println("Enter the character to search:");
		char charToSearch=s.next().charAt(0);
		char charToSearchCopy=Character.toLowerCase(charToSearch);
		char[]array=msgCopy.toCharArray();
		for(char ch:array) 
		{
			if(ch==charToSearchCopy)
			{
				count=count+1;
			}
		}
		System.out.println("Frequency of given character:"+charToSearch+" occured is "+count);
		
		
	}

}
