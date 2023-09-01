package feb;

import java.util.*;

public class token {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("enter integers with one space gap:");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		
		while(st.hasMoreTokens()) {
			
			String temp=st.nextToken();
			n=Integer.parseInt(temp);
			System.out.println(temp);
			sum=sum+n;
		}
		System.out.println("the sum is:"+sum);
	}
}
