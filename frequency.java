package feb;

import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=new String();
		str=s.nextLine();
		String strcopy=str.toLowerCase();
		char[] array=strcopy.toCharArray();
		
		System.out.println("enter the character to search:");
		char chartosearch=s.next().charAt(0); 
		char chartosearchcopy=Character.toLowerCase(chartosearch);
		
		for(char ch:array) {
			if(ch==chartosearchcopy) {
				count=count+1;
			}
		}
		System.out.println("frequency of character is:"+count);

	}

}
