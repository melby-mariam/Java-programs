package feb;

import java.util.*;

public class Custom {

	public static void main(String[] args) throws AgeException {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		
		try {
			
		if(age<18) {
			throw new AgeException("BELOW 18");
		}
		else {
			System.out.println("welcome");
		}
	}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
}
}

